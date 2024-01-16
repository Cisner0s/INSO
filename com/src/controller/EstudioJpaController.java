package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Estudio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author rodri
 */
public class EstudioJpaController implements Serializable {

    private EntityManager em;

    public EstudioJpaController(EntityManager em) {
        this.em = em;
    }

    public EstudioJpaController() {
        em = Persistence.createEntityManagerFactory("InsoPU").createEntityManager();
    }

    /*public void create(Estudio estudio) {
        EntityTransaction tx = null;

        try {
            tx = em.getTransaction();
            tx.begin();

            // Persistir la entidad
            em.persist(estudio);

            tx.commit();
        } catch (Exception ex) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            ex.printStackTrace(); // Manejar la excepción adecuadamente
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }*/
    public void addEstudio(Estudio estudio) {
        EntityManager entityManager = em;
        EntityTransaction transaction = null;

        try {
            // Iniciar transacción
            transaction = entityManager.getTransaction();
            transaction.begin();

            // Guardar el objeto de estudio
            entityManager.persist(estudio);

            // Commit de la transacción
            transaction.commit();

            System.out.println("Estudio added successfully!");
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Cerrar EntityManager
            entityManager.close();
        }
    }
/*
    public Estudio findEstudio(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Estudio.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }*/
    public List<Estudio> findEstudioEntities() {
    EntityManager entityManager = em;
    List<Estudio> estudios = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Estudio> criteriaQuery = criteriaBuilder.createQuery(Estudio.class);
        Root<Estudio> root = criteriaQuery.from(Estudio.class);
        criteriaQuery.select(root);

        TypedQuery<Estudio> query = entityManager.createQuery(criteriaQuery);
        estudios = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return estudios;
}

}

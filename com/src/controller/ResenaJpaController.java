package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Resena;
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
public class ResenaJpaController implements Serializable {

    private EntityManagerFactory emf;

    public ResenaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ResenaJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    /*public void create(Resena resena) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(resena);
            tx.commit();
        } catch (Exception ex) {
            if (findResena(resena.getResena_id()) != null) {
                throw new EntityExistsException("Resena " + resena + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }*/
public void addResena(Resena resena) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Iniciar transacción
            transaction = entityManager.getTransaction();
            transaction.begin();

            // Guardar el objeto de resena
            entityManager.persist(resena);

            // Commit de la transacción
            transaction.commit();

            System.out.println("Resena added successfully!");
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
    public List<Resena> findResenaEntities() {
    EntityManager entityManager = emf.createEntityManager();
    List<Resena> resenas = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Resena> criteriaQuery = criteriaBuilder.createQuery(Resena.class);
        Root<Resena> root = criteriaQuery.from(Resena.class);
        criteriaQuery.select(root);

        TypedQuery<Resena> query = entityManager.createQuery(criteriaQuery);
        resenas = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return resenas;
}

}

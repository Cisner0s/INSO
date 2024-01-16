package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Serie;
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
public class SerieJpaController implements Serializable {

    private EntityManagerFactory emf;

    public SerieJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public SerieJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    /*public void create(Serie serie) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(serie);
            tx.commit();
        } catch (Exception ex) {
            if (findSerie(serie.getSerie_id()) != null) {
                throw new EntityExistsException("Serie " + serie + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }*/
     public void addSerie(Serie serie) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Iniciar transacción
            transaction = entityManager.getTransaction();
            transaction.begin();

            // Guardar el objeto de serie
            entityManager.persist(serie);

            // Commit de la transacción
            transaction.commit();

            System.out.println("Serie added successfully!");
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

    public List<Serie> findSerieEntities() {
    EntityManager entityManager = emf.createEntityManager();
    List<Serie> series = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Serie> criteriaQuery = criteriaBuilder.createQuery(Serie.class);
        Root<Serie> root = criteriaQuery.from(Serie.class);
        criteriaQuery.select(root);

        TypedQuery<Serie> query = entityManager.createQuery(criteriaQuery);
        series = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return series;
}

}

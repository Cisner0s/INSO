/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Critica;
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
class CriticaJpaController {
     private EntityManagerFactory emf;

    public CriticaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CriticaJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    /*public void create(Critica critica) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(critica);
            tx.commit();
        } catch (Exception ex) {
            if (findCritica(critica.getCritica_id()) != null) {
                throw new EntityExistsException("Director " + critica + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }*/
    public void addCritica(Critica critica) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Begin transaction
            transaction = entityManager.getTransaction();
            transaction.begin();

            // Guardar el objeto de crítica
            entityManager.persist(critica);

            // Commit the transaction
            transaction.commit();

            System.out.println("Critica added successfully!");
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close EntityManager
            entityManager.close();
        }
    }

    public List<Critica> findCriticaEntities() {
    EntityManager entityManager = emf.createEntityManager();
    List<Critica> criticas = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Critica> criteriaQuery = criteriaBuilder.createQuery(Critica.class);
        Root<Critica> root = criteriaQuery.from(Critica.class);
        criteriaQuery.select(root);

        TypedQuery<Critica> query = entityManager.createQuery(criteriaQuery);
        criticas = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return criticas;
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.*;
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
class CriticoJpaController{
     private EntityManagerFactory emf;

    public CriticoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CriticoJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    /*public void create(Critico critico) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(critico);
            tx.commit();
        } catch (Exception ex) {
            if (findCritico(critico.getId_Critico()) != null) {
                throw new EntityExistsException("Director " + critico + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }*/
    public void addCritico(Critico critico) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Begin transaction
            transaction = entityManager.getTransaction();
            transaction.begin();

            // Guardar el objeto de crítico
            entityManager.persist(critico);

            // Commit the transaction
            transaction.commit();

            System.out.println("Critico added successfully!");
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

    public List<Critico> findCriticoEntities() {
    EntityManager entityManager = emf.createEntityManager();
    List<Critico> criticos = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Critico> criteriaQuery = criteriaBuilder.createQuery(Critico.class);
        Root<Critico> root = criteriaQuery.from(Critico.class);
        criteriaQuery.select(root);

        TypedQuery<Critico> query = entityManager.createQuery(criteriaQuery);
        criticos = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return criticos;
}

}

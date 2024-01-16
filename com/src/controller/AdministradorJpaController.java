/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Administrador;
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
class AdministradorJpaController {
         private EntityManagerFactory emf;

    public AdministradorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public AdministradorJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void addAdministrador(Administrador administrador) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Begin transaction
            transaction = entityManager.getTransaction();
            transaction.begin();

            // Save the administrator object
            entityManager.persist(administrador);

            // Commit the transaction
            transaction.commit();

            System.out.println("Administrator added successfully!");
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

    public List<Administrador> findAdministradorEntities() {
    EntityManager entityManager = emf.createEntityManager();
    List<Administrador> administradores = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Administrador> criteriaQuery = criteriaBuilder.createQuery(Administrador.class);
        Root<Administrador> root = criteriaQuery.from(Administrador.class);
        criteriaQuery.select(root);

        TypedQuery<Administrador> query = entityManager.createQuery(criteriaQuery);
        administradores = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return administradores;
}
}

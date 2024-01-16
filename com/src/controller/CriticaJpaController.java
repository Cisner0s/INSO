/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Critica;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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

    public void create(Critica critica) {
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
    }

    public Critica findCritica(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Critica.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

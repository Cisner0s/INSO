/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.*;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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

    public void create(Critico critico) {
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
    }

    public Critico findCritico(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Critico.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

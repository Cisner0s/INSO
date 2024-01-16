/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Administrador;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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

    public void create(Administrador administrador) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(administrador);
            tx.commit();
        } catch (Exception ex) {
            if (findAdministrador(administrador.getUsuario_id()) != null) {
                throw new EntityExistsException("Director " + administrador + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Administrador findAdministrador(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Administrador.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

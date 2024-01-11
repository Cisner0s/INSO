package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Resena;
import java.io.Serializable;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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

    public void create(Resena resena) {
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
    }

    public Resena findResena(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Resena.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

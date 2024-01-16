package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Estudio;
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
public class EstudioJpaController implements Serializable {

    private EntityManager em;

    public EstudioJpaController(EntityManager em) {
        this.em = em;
    }

    public EstudioJpaController() {
        em = Persistence.createEntityManagerFactory("InsoPU").createEntityManager();
    }

    public void create(Estudio estudio) {
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
}

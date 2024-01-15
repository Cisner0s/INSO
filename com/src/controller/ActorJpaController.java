package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Actor;
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
public class ActorJpaController implements Serializable {

    private EntityManagerFactory emf;

    public ActorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ActorJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void create(Actor actor) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(actor);
            tx.commit();
        } catch (Exception ex) {
            if (findActor(actor.getActor_ID()) != null) {
                throw new EntityExistsException("Actor " + actor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Actor findActor(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Actor.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

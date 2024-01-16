package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Actor;
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
public class ActorJpaController implements Serializable {

    private EntityManagerFactory emf;

    public ActorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ActorJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
        
    }

   /* public void create(Actor actor) {
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
    }*/
    public void addActor(Actor actor) {
    EntityManager entityManager = emf.createEntityManager();
    EntityTransaction transaction = null;

    try {
        // Begin transaction
        transaction = entityManager.getTransaction();
        transaction.begin();

        // Save the actor object
        entityManager.persist(actor);

        // Commit the transaction
        transaction.commit();

        System.out.println("Actor added successfully!");
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


    public List<Actor> findActorEntities() {
    EntityManager entityManager = emf.createEntityManager();
    List<Actor> actors = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Actor> criteriaQuery = criteriaBuilder.createQuery(Actor.class);
        Root<Actor> root = criteriaQuery.from(Actor.class);
        criteriaQuery.select(root);

        TypedQuery<Actor> query = entityManager.createQuery(criteriaQuery);
        actors = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return actors;
}
}

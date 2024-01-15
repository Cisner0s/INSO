package controller;

import model.Director;
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
public class DirectorJpaController implements Serializable {

    private EntityManagerFactory emf;

    public DirectorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public DirectorJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void create(Director director) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(director);
            tx.commit();
        } catch (Exception ex) {
            if (findDirector(director.getDirector_id()) != null) {
                throw new EntityExistsException("Director " + director + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Director findDirector(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Director.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

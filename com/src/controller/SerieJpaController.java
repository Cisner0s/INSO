package controller;

import model.Serie;
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
public class SerieJpaController implements Serializable {

    private EntityManagerFactory emf;

    public SerieJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public SerieJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void create(Serie serie) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(serie);
            tx.commit();
        } catch (Exception ex) {
            if (findSerie(serie.getSerie_id()) != null) {
                throw new EntityExistsException("Serie " + serie + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Serie findSerie(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Serie.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

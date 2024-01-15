package controller;

import model.Pelicula;
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
public class PeliculaJpaController implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf;

    public PeliculaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PeliculaJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void create(Pelicula pelicula) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(pelicula);
            tx.commit();
        } catch (Exception ex) {
            if (findPelicula(pelicula.getPelicula_id()) != null) {
                throw new EntityExistsException("Pelicula " + pelicula + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Pelicula findPelicula(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Pelicula.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

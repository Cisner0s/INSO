package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Pelicula;
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

    private EntityManager emf;


    public PeliculaJpaController(EntityManager emf) {
        this.emf = emf;
    }

    public PeliculaJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU").createEntityManager();
    }

    public void create(Pelicula pelicula) {
        EntityTransaction tx = null;

        try {
            tx = emf.getTransaction();
            tx.begin();

            // Persistir la entidad
            emf.persist(pelicula);

            tx.commit();
        } catch (Exception ex) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            ex.printStackTrace(); // Manejar la excepción adecuadamente
        } finally {
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        }
    }

    /*public Pelicula findPelicula(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Pelicula.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }*/
}

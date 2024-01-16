package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.Pelicula;
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
    public List<Pelicula> findPeliculaEntities() {
    EntityManager entityManager = emf;
    List<Pelicula> peliculas = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Pelicula> criteriaQuery = criteriaBuilder.createQuery(Pelicula.class);
        Root<Pelicula> root = criteriaQuery.from(Pelicula.class);
        criteriaQuery.select(root);

        TypedQuery<Pelicula> query = entityManager.createQuery(criteriaQuery);
        peliculas = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return peliculas;
}

}

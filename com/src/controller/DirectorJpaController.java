package controller;

import model.Director;
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
import org.eclipse.persistence.sessions.factories.SessionFactory;

/**
 *
 * @author rodri
 */
public class DirectorJpaController implements Serializable {

   /*private EntityManager em;

    public DirectorJpaController(EntityManager em) {
        this.em = em;
    }

    public DirectorJpaController() {
        em = Persistence.createEntityManagerFactory("InsoPU").createEntityManager();
    }

    public void create(Director director) {
        EntityTransaction tx = null;

        try {
            tx = em.getTransaction();
            tx.begin();

            // Persistir la entidad
            em.persist(director);

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
    }*/
     private final EntityManagerFactory entityManagerFactory;

    public DirectorJpaController() {
        // "your-persistence-unit" should be replaced with the name of your persistence unit
        entityManagerFactory = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void addDirector(Director director) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;
        
        try {
            // Begin transaction
            transaction = entityManager.getTransaction();
            transaction.begin();

            // Save the director object
            entityManager.persist(director);

            // Commit the transaction
            transaction.commit();

            System.out.println("Director added successfully!");
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

   public List<Director> findDirectorEntities() {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    List<Director> directors = new ArrayList<>();

    try {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Director> criteriaQuery = criteriaBuilder.createQuery(Director.class);
        Root<Director> root = criteriaQuery.from(Director.class);
        criteriaQuery.select(root);

        TypedQuery<Director> query = entityManager.createQuery(criteriaQuery);
        directors = query.getResultList();
    } catch (Exception e) {
        // Manejar la excepción de manera apropiada (log, relanzar, etc.)
        e.printStackTrace();
    } finally {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    return directors;
    }




}

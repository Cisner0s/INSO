package controller;

import model.Estudio;
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

    private EntityManagerFactory emf;

    public EstudioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EstudioJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void create(Estudio estudio) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(estudio);
            tx.commit();
        } catch (Exception ex) {
            if (findEstudio(estudio.getEstudio_id()) != null) {
                throw new EntityExistsException("Estudio " + estudio + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Estudio findEstudio(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Estudio.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

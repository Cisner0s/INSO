package controller;

import model.Usuario;
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
public class UsuarioJpaController implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf;

    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public UsuarioJpaController() {
        emf = Persistence.createEntityManagerFactory("InsoPU");
    }

    public void create(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(usuario);
            tx.commit();
        } catch (Exception ex) {
            if (findUsuario(usuario.getUsuario_id()) != null) {
                throw new EntityExistsException("Usuario " + usuario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public Usuario findUsuario(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}

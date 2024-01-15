package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_Critico")
public class Critico extends Usuario implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany
    private List<Critica> critica;



    public Critico(List<Critica> critica, int usuario_id, String nombreUsuario, String nombreCompleto, int rol, String contraseña, Resena resena) {
        super(usuario_id, nombreUsuario, nombreCompleto, rol, contraseña);
        this.critica = critica;
    }

 

    public List<Critica> getCritica() {
        return critica;
    }

    public void setCritica(List<Critica> critica) {
        this.critica = critica;
    }
}

package com.mycompany.inso.LOG;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_Critico")
public class Critico extends Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Critico;

    @OneToMany
    private List<Critica> critica;

    public Critico() {
        super();
    }

    public Critico(int id_Critico, List<Critica> critica, int usuario_id, String nombreUsuario, String nombreCompleto, int rol, String contraseña, Resena resena) {
        super(usuario_id, nombreUsuario, nombreCompleto, rol, contraseña);
        this.id_Critico = id_Critico;
        this.critica = critica;
    }

    public int getId_Critico() {
        return id_Critico;
    }

    public void setId_Critico(int id_Critico) {
        this.id_Critico = id_Critico;
    }

    public List<Critica> getCritica() {
        return critica;
    }

    public void setCritica(List<Critica> critica) {
        this.critica = critica;
    }
}

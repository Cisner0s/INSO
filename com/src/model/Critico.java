package com.mycompany.inso.LOG;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Critico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Critico;
    private String nombreUsuario;
    private String nombreCompleto;
    private String contraseña;
    @OneToMany(mappedBy = "critico", cascade = CascadeType.PERSIST)
private List<Critica> criticas;


    public Critico() {
        // Constructor vacío
    }

    public Critico(String nombreUsuario, String nombreCompleto, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.nombreCompleto = nombreCompleto;
        this.contraseña = contraseña;
    }

    public int getId_Critico() {
        return id_Critico;
    }

    public void setId_Critico(int id_Critico) {
        this.id_Critico = id_Critico;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    

    public List<Critica> getCriticas() {
        return criticas;
    }

    public void setCriticas(List<Critica> criticas) {
        this.criticas = criticas;
    }
}

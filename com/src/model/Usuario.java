/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.LOG;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 *
 * @author rodri
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int usuario_id;
    private String nombreUsuario;
    private String nombreCOmpleto;
    private int rol;
    private String contraseña;
    
    @OneToMany
    private List<Resena> resena;

    public Usuario(int usuario_id, String nombreUsuario, String nombreCOmpleto, int rol, String contraseña) {
        this.usuario_id = usuario_id;
        this.nombreUsuario = nombreUsuario;
        this.nombreCOmpleto = nombreCOmpleto;
        this.rol = rol;
        this.contraseña = contraseña;
        
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCOmpleto() {
        return nombreCOmpleto;
    }

    public void setNombreCOmpleto(String nombreCOmpleto) {
        this.nombreCOmpleto = nombreCOmpleto;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Resena> getCriticas() {
        return resena;
    }

    public void setCriticas(List<Resena> resena) {
        this.resena = resena;
    }
    
    

}

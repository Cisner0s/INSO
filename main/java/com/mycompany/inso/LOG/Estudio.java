/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.LOG;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int estudio_id;
    private String nombre;
    private String fecha_FUndacion;
    private String propietario;
    private String sedes;
    private int patrimonio;
    
    
    public Estudio(int estudio_id, String nombre, String fecha_FUndacion, String propietario, String sedes, int patrimonio, Pelicula pelis, Serie series) {
        this.estudio_id = estudio_id;
        this.nombre = nombre;
        this.fecha_FUndacion = fecha_FUndacion;
        this.propietario = propietario;
        this.sedes = sedes;
        this.patrimonio = patrimonio;
   
    }

    public int getEstudio_id() {
        return estudio_id;
    }

    public void setEstudio_id(int estudio_id) {
        this.estudio_id = estudio_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_FUndacion() {
        return fecha_FUndacion;
    }

    public void setFecha_FUndacion(String fecha_FUndacion) {
        this.fecha_FUndacion = fecha_FUndacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getSedes() {
        return sedes;
    }

    public void setSedes(String sedes) {
        this.sedes = sedes;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }


    
}

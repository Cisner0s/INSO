/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.LOG;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Resena {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int resena_id;
    private String tituloResena;
    private String textoResena;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "peli_id") // Ajusta el nombre de la columna según tu modelo
    private Pelicula pelicula;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "serie_id") // Ajusta el nombre de la columna según tu modelo
    private Serie serie;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario;

    public Resena(String tituloResena, String textoResena, Usuario usuario) {
        this.tituloResena = tituloResena;
        this.textoResena = textoResena;
        this.pelicula = pelicula;
        this.usuario = usuario;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Resena() {
        // Constructor vacío
    }

    public int getResena_id() {
        return resena_id;
    }

    public void setResena_id(int resena_id) {
        this.resena_id = resena_id;
    }

    public String getTituloResena() {
        return tituloResena;
    }

    public void setTituloResena(String tituloResena) {
        this.tituloResena = tituloResena;
    }

    public String getTextoResena() {
        return textoResena;
    }

    public void setTextoResena(String textoResena) {
        this.textoResena = textoResena;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

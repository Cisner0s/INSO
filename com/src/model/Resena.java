/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author rodri
 */
@Entity
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int resena_id;
    private String tituloResena;
    private String textoResena;

    public Resena(int resena_id, String tituloResena, String textoResena) {
        this.resena_id = resena_id;
        this.tituloResena = tituloResena;
        this.textoResena = textoResena;
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

}

package model;

import controller.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// Importar otras anotaciones según sea necesario
@Entity
public class Critica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int critica_id;
    private String titulo;
    private String texto;

     @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    // Otros campos y métodos según sea necesario
    @ManyToOne
    @JoinColumn(name = "serie_id") // Asegúrate de que coincida con el nombre de la columna en la base de datos
    private Serie serie;

    @ManyToOne
    @JoinColumn(name = "critico_id")  // Corregir el nombre de la columna en JoinColumn
    private Critico critico;
    public Critica(String titulo,String texto) {
        this.titulo = titulo;
        this.texto=texto;
    }

    public int getCritica_id() {
        return critica_id;
    }

    public void setCritica_id(int critica_id) {
        this.critica_id = critica_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Critico getCritico() {
        return critico;
    }

    public void setCritico(Critico critico) {
        this.critico = critico;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

   

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    // Otros métodos según sea necesario

    public Critica() {
        // Constructor vacío
    }
}

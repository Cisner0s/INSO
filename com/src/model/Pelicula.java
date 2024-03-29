/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int pelicula_id;
    private String titulo;
    private String fecha_Estreno;
    private String genero;
    private int presupuesto;
    private int ganancias;
    private String sinopsis;
    private String imagen;
    
    @ManyToOne
    @JoinColumn(name = "director_id") // Mapea con el campo director_id en la base de datos
    private Director director;
    
    @ManyToOne
    private Estudio estudio;
    
    @ManyToMany(cascade = CascadeType.PERSIST, mappedBy = "peliculas")
    private List<Actor> actores;


    
    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL)
    private List<Resena> resenas;

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.PERSIST)
private List<Critica> criticas;

    
    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_Estreno() {
        return fecha_Estreno;
    }

    public void setFecha_Estreno(String fecha_Estreno) {
        this.fecha_Estreno = fecha_Estreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public List<Resena> getResenas() {
        return resenas;
    }

    public void setResenas(List<Resena> resenas) {
        this.resenas = resenas;
    }

    public Pelicula(String titulo, String fecha_Estreno, String genero, int presupuesto, int ganancias, String sinopsis, String imagen, Director director, Estudio estudio, List<Actor> actores) {
        this.titulo = titulo;
        this.fecha_Estreno = fecha_Estreno;
        this.genero = genero;
        this.presupuesto = presupuesto;
        this.ganancias = ganancias;
        this.sinopsis = sinopsis;
        this.imagen = imagen;
        this.director = director;
        this.estudio = estudio;
        this.actores = actores;
    }

    public Pelicula() {
        // Constructor vacío
    }
}

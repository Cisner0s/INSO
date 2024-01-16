package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Actor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int actor_ID;
    private String nombre;
    private String fecha_Nacimiento;
    private String sexo;
    private String lugar_nacimiento;
    private String nacionalidad;
    private String premios;
    private String imagen;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "PELICULA_ACTOR", 
        joinColumns = @JoinColumn(name = "ACTOR_ID"), 
        inverseJoinColumns = @JoinColumn(name = "PELICULA_ID")
    )
    private List<Pelicula> peliculas;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "SERIE_ACTOR", 
        joinColumns = @JoinColumn(name = "ACTOR_ID"), 
        inverseJoinColumns = @JoinColumn(name = "SERIE_ID")
    )
    private List<Serie> series;

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }


    public Actor() {
        
    }
    
    public Actor(String nombre, String fecha_Nacimiento, String sexo, String lugar_nacimiento, String nacionalidad, String premios, String imagen) {
        this.nombre = nombre;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.sexo = sexo;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nacionalidad = nacionalidad;
        this.premios = premios;
        this.imagen = imagen;
    }

    public int getActor_ID() {
        return actor_ID;
    }

    public void setActor_ID(int actor_ID) {
        this.actor_ID = actor_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }


}

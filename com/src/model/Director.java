package com.mycompany.inso.LOG;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.CascadeType;

@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int director_id;

    private String nombre;
    private String fecha_Nacimiento;
    private String sexo;
    private String lugar_nacimiento;
    private String nacionalidad;
    private String premios;
    private String nominaciones;

    @OneToMany(mappedBy = "director", cascade = CascadeType.PERSIST)
private List<Pelicula> peliculas;
    @OneToMany(mappedBy = "director", cascade = CascadeType.PERSIST)
private List<Serie> series;

    @Deprecated
    public Director() {
        // Constructor vacío marcado como @Deprecated
    }

    public Director(String nombre, String fecha_Nacimiento, String sexo, String lugar_nacimiento, String nacionalidad, String premios, String nominaciones) {
        this.nombre = nombre;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.sexo = sexo;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nacionalidad = nacionalidad;
        this.premios = premios;
        this.nominaciones = nominaciones;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
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

    public String getNominaciones() {
        return nominaciones;
    }

    public void setNominaciones(String nominaciones) {
        this.nominaciones = nominaciones;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    @Override
public String toString() {
    return "Director{" +
            "director_id=" + director_id +
            ", nombre='" + nombre + '\'' +
            ", fecha_Nacimiento='" + fecha_Nacimiento + '\'' +
            ", sexo='" + sexo + '\'' +
            ", lugar_nacimiento='" + lugar_nacimiento + '\'' +
            ", nacionalidad='" + nacionalidad + '\'' +
            ", premios='" + premios + '\'' +
            ", nominaciones='" + nominaciones + '\'' +
            '}';
}

}

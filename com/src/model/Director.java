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
import javax.persistence.OneToMany;
@Entity
public class Director {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int director_id;
    private String nombre;
    private String fecha_Nacimiento;
    private String sexo;
    private String lugar_nacimiento;
    private String nacionalidad;
    private String premios;
    private String nominaciones;
    
   
    public Director(){
        
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

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public void setNominaciones(String nominaciones) {
        this.nominaciones = nominaciones;
    }

    public int getDirector_id() {
        return director_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPremios() {
        return premios;
    }

    public String getNominaciones() {
        return nominaciones;
    }
}

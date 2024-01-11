/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.LOG;
import com.mycompany.inso.BD.ControladorBD;
import java.util.List;
/**
 *
 * @author rodri
 */
public class Controlador {
    ControladorBD controladorBD = new ControladorBD();
    
    public void guardarPelicula(String titulo,String fecha_nacimiento,String genero,int presupuesto,int ganancias,String sinopsis,String imagen, Estudio estudio,Director director){
         Pelicula peli= new Pelicula(titulo, fecha_nacimiento, genero, presupuesto, ganancias, sinopsis, imagen, director, estudio);
         controladorBD.guardarPelicula(peli);
    }
    public void guardarDirector(String nombre, String fecha_Nacimiento, String sexo, String lugar_nacimiento, String nacionalidad, String premios, String nominaciones){
         Director director= new Director(nombre,fecha_Nacimiento,sexo,lugar_nacimiento,nacionalidad, premios,nominaciones);
         controladorBD.guardarDirector(director);
    }
    /*public List<Director> traerDirector(){
        return controladorBD.traerDirector();
    }*/


}

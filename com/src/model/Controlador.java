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
    public void guardarSerie(int serie_id, String titulo, String fecha_Estreno, String genero, int presupuesto, int ganacias, int n_Episodios, double Duracion_Med_Episodio, String imagen, int n_Temporadas, Estudio estudio, Director director){
        Serie serie = new Serie(serie_id, titulo, fecha_Estreno, genero, presupuesto, ganacias, n_Episodios, Duracion_Med_Episodio, imagen, n_Temporadas, estudio, director);
        controladorBD.guardarSerie(serie);
    }
    public void guardarActor(int actor_ID, String nombre, String fecha_Nacimiento, String sexo, String lugar_nacimiento, String nacionalidad, String premios, String imagen){
        Actor actor = new Actor(actor_ID, nombre, fecha_Nacimiento, sexo, lugar_nacimiento, nacionalidad, premios, imagen);
        controladorBD.guardarActor(actor);
    }
    public void guardarEstudio(int estudio_id, String nombre, String fecha_FUndacion, String propietario, String sedes, int patrimonio){
        Estudio estudio = new Estudio(estudio_id, nombre, fecha_FUndacion, propietario, sedes, patrimonio);
        controladorBD.guardarEstudio(estudio);
    }
    public void guardarCritico(List<Critica> critica, int usuario_id, String nombreUsuario, String nombreCompleto, int rol, String contraseña, Resena resena){
        Critico critico = new Critico(critica, usuario_id, nombreUsuario, nombreCompleto, rol, contraseña, resena);
        controladorBD.guardarCritico(critico);
    }
    public void guardarCritico(int idCritica, String tituloCritica, String textoCritica){
        Critica critica = new Critica(idCritica, tituloCritica, textoCritica);
         controladorBD.guardarCritica(critica);
    }
    public void guardarResena(int resena_id, String tituloResena, String textoResena){
        Resena resena = new Resena(resena_id, tituloResena, textoResena);
        controladorBD.guardarResena(resena);
    }
    public void guardarUsuario(int usuario_id, String nombreUsuario, String nombreCOmpleto, int rol, String contraseña){
        Usuario usuario = new Administrador(usuario_id, nombreUsuario, nombreCOmpleto, rol, contraseña);
        controladorBD.guardarUsuario(usuario);
    }
    public void guardarAdministrador(int usuario_id, String nombreUsuario, String nombreCOmpleto, int rol, String contraseña){
        Administrador admin= new Administrador(usuario_id, nombreUsuario, nombreCOmpleto, rol, contraseña);
        controladorBD.guardarAdmnistrador(admin);
    }
    /*public List<Director> traerDirector(){
        return controladorBD.traerDirector();
    }*/


}

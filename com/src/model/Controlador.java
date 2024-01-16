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
    
    public void guardarPelicula(String titulo,String fecha_nacimiento,String genero,int presupuesto,int ganancias,String sinopsis,String imagen, Estudio estudio,Director director,List<Actor> actores){
         Pelicula peli= new Pelicula(titulo, fecha_nacimiento, genero, presupuesto, ganancias, sinopsis, imagen, director, estudio, actores);
         controladorBD.guardarPelicula(peli);
    }
    public void guardarDirector(String nombre, String fecha_Nacimiento, String sexo, String lugar_nacimiento, String nacionalidad, String premios, String nominaciones){
         Director director= new Director(nombre,fecha_Nacimiento,sexo,lugar_nacimiento,nacionalidad, premios,nominaciones);
         controladorBD.guardarDirector(director);
    }
    public void guardarSerie(String titulo, String fecha_Estreno, String genero, int presupuesto, int ganacias, int n_Episodios, double Duracion_Med_Episodio, String imagen, int n_Temporadas, Estudio estudio, Director director){
        Serie serie = new Serie(titulo, fecha_Estreno, genero, presupuesto, ganacias, n_Episodios, Duracion_Med_Episodio, imagen, n_Temporadas, estudio, director);
        controladorBD.guardarSerie(serie);
    }
    public void guardarActor(String nombre, String fecha_Nacimiento, String sexo, String lugar_nacimiento, String nacionalidad, String premios, String imagen){
        Actor actor = new Actor(nombre, fecha_Nacimiento, sexo, lugar_nacimiento, nacionalidad, premios, imagen);
        controladorBD.guardarActor(actor);
    }
    public void guardarEstudio(int estudio_id, String nombre, String fecha_FUndacion, String propietario, String sedes, int patrimonio){
        Estudio estudio = new Estudio(nombre, fecha_FUndacion, propietario, sedes, patrimonio);
        controladorBD.guardarEstudio(estudio);
    }
    public void guardarCritico( String nombreUsuario, String nombreCompleto, String contraseña){
        Critico critico = new Critico( nombreUsuario, nombreCompleto,  contraseña);
        controladorBD.guardarCritico(critico);
    }
    public void guardarCritica( String tituloCritica, String textoCritica){
        Critica critica = new Critica(tituloCritica, textoCritica);
         controladorBD.guardarCritica(critica);
    }
    public void guardarResena(String tituloResena, String textoResena, Pelicula pelicula, Usuario usuario){
        Resena resena = new Resena(tituloResena, textoResena, usuario);
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
    public void guardarPelicula(Pelicula pelicula) {
    controladorBD.guardarPelicula(pelicula);
    }

    
    public void guardarDirector(Director director) {
        controladorBD.guardarDirector(director);
    }

    public void guardarSerie(Serie serie) {
        controladorBD.guardarSerie(serie);
    }

    public void guardarActor(Actor actor) {
        controladorBD.guardarActor(actor);
    }

    public void guardarEstudio(Estudio estudio) {
        controladorBD.guardarEstudio(estudio);
    }

    public void guardarCritico(Critico critico) {
        controladorBD.guardarCritico(critico);
    }

    public void guardarCritica(Critica critica) {
        controladorBD.guardarCritica(critica);
    }

    public void guardarResena(Resena resena) {
        controladorBD.guardarResena(resena);
    }

    public void guardarUsuario(Usuario usuario) {
        controladorBD.guardarUsuario(usuario);
    }

    public void guardarAdministrador(Administrador admin) {
        controladorBD.guardarAdmnistrador(admin);
    }

    public List<Director> traerDirector(){
        return controladorBD.traerDirector();
    }
    public List<Actor> traerActores() {
    return controladorBD.traerActor();
    }
    public List<Administrador> traerAdministrador(){
        return controladorBD.traerAdministrador();
    }
    public List<Critica> traerCritica() {
    return controladorBD.traerCritica();
    }
    public List<Critico> traerCritico(){
        return controladorBD.traerCritico();
    }
    public List<Estudio> traerEstudio() {
    return controladorBD.traerEstudio();
    }
    
    public List<Pelicula> traerPelicula() {
    return controladorBD.traerPelicula();
    }
    public List<Resena> traerResena(){
        return controladorBD.traerResena();
    }
    public List<Serie> traerSerie() {
    return controladorBD.traerSerie();
    }
    public List<Usuario> traerUsuario() {
    return controladorBD.traerUsuario();
    }
    

    


}

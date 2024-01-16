package com.mycompany.inso.BD;

import com.mycompany.inso.LOG.*;
import java.util.List;


public class ControladorBD {
    DirectorJpaController directorJpa = new DirectorJpaController();
    PeliculaJpaController peliJpa = new PeliculaJpaController();
    SerieJpaController serieJpa = new SerieJpaController();
    EstudioJpaController estudioJpa = new EstudioJpaController();
    ActorJpaController actorJpa = new ActorJpaController();
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    ResenaJpaController resenaJpa = new ResenaJpaController();
    CriticoJpaController criticoJpa = new CriticoJpaController();
    CriticaJpaController criticaJpa = new CriticaJpaController();
    AdministradorJpaController administradorJpa = new AdministradorJpaController();


    public void guardarPelicula(Pelicula peli) {
        peliJpa.create(peli);
    }
    public void guardarSerie(Serie serie) {
        serieJpa.addSerie(serie);
    }
    public void guardarDirector(Director director) {
        directorJpa.addDirector(director);
    }
    public void guardarEstudio(Estudio estudio) {
        estudioJpa.addEstudio(estudio);
    }
    public void guardarUsuario(Usuario usuario) {
        usuarioJpa.addUsuario(usuario);
    }
    public void guardarActor(Actor actor){
        actorJpa.addActor(actor);
    }
    public void guardarResena(Resena resena){
        resenaJpa.addResena(resena);
    }
    public void guardarCritico(Critico critico) {
        criticoJpa.addCritico(critico);
    }
    public void guardarCritica(Critica critica) {
        criticaJpa.addCritica(critica);
    }
    public void guardarAdmnistrador(Administrador admin) {
        administradorJpa.addAdministrador(admin);
    }
    
    
    public List<Director> traerDirector(){
       return directorJpa.findDirectorEntities();
   }
    public List<Actor> traerActor(){
       return actorJpa.findActorEntities();
   }
    public List<Administrador> traerAdministrador(){
       return administradorJpa.findAdministradorEntities();
   }
    public List<Critica> traerCritica(){
       return criticaJpa.findCriticaEntities();
   }
    public List<Critico> traerCritico(){
       return criticoJpa.findCriticoEntities();
   }
    public List<Estudio> traerEstudio(){
       return estudioJpa.findEstudioEntities();
   }
     public List<Pelicula> traerPelicula(){
       return peliJpa.findPeliculaEntities();
   }
    public List<Resena> traerResena(){
       return resenaJpa.findResenaEntities();
   }
    public List<Serie> traerSerie(){
       return serieJpa.findSerieEntities();
   }
    public List<Usuario> traerUsuario(){
       return usuarioJpa.findUsuarioEntities();
   }

}

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
        serieJpa.create(serie);
    }
    public void guardarDirector(Director director) {
        directorJpa.addDirector(director);
    }
    public void guardarEstudio(Estudio estudio) {
        estudioJpa.create(estudio);
    }
    public void guardarUsuario(Usuario usuario) {
        usuarioJpa.create(usuario);
    }
    public void guardarActor(Actor actor){
        actorJpa.create(actor);
    }
    public void guardarResena(Resena resena){
        resenaJpa.create(resena);
    }
    public void guardarCritico(Critico critico) {
        criticoJpa.create(critico);
    }
    public void guardarCritica(Critica critica) {
        criticaJpa.create(critica);
    }
    public void guardarAdmnistrador(Administrador admin) {
        administradorJpa.create(admin);
    }
    
    
  /* public List<Director> traerDirector(){
       return directorJpa.findDirectorEntities();
   }*/

}

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
    

    public void guardarPelicula(Pelicula peli) {
        peliJpa.create(peli);
    }
    public void guardarSerie(Serie serie) {
        serieJpa.create(serie);
    }
    public void guardarDirector(Director director) {
        directorJpa.create(director);
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
  /* public List<Director> traerDirector(){
       return directorJpa.findDirectorEntities();
   }*/

}
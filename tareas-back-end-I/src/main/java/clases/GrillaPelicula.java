package clases;

import interfaces.IGrillaPeliculas;

import java.util.ArrayList;
import java.util.List;

public class GrillaPelicula implements IGrillaPeliculas {

    private final List<Pelicula> peliculas = new ArrayList<>();

    public GrillaPelicula() {
    }

    @Override
    public Pelicula getPeliculas(String nombre) throws PeliculaInexistenteException{

        for(Pelicula peli : this.peliculas){
            if(nombre.equals(peli.nombre())){
                return peli;
            }
        }
        throw new  PeliculaInexistenteException("La pelicula no existe.");
    }

    public void addPelicula(Pelicula peli){
        this.peliculas.add(peli);
    }
}

package interfaces;

import clases.PaisMalConfiguradoException;
import clases.Pelicula;
import clases.PeliculaInexistenteException;
import clases.PeliculaNoHabilitadaException;

public interface IGrillaPeliculas {
    Pelicula getPeliculas(String nombre) throws PeliculaNoHabilitadaException, PeliculaInexistenteException, PaisMalConfiguradoException;
}

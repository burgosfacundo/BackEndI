package clases;

import interfaces.IGrillaPeliculas;



public class GrillaPeliculasProxy implements IGrillaPeliculas  {

    private final GrillaPelicula pelicula;
    private final Ip ip;

    public GrillaPeliculasProxy(Ip ip, GrillaPelicula pelicula) {
        this.pelicula = pelicula;
        this.ip = ip;
    }

    @Override
    public Pelicula getPeliculas(String nombre) throws PeliculaNoHabilitadaException, PaisMalConfiguradoException, PeliculaInexistenteException {

        if (this.obtenerPais().equals(this.pelicula.getPeliculas(nombre).pais())){
            return this.pelicula.getPeliculas(nombre);
        }
        throw new PeliculaNoHabilitadaException("La pelicula no esta habilitada para ese pais.");

    }

    public String obtenerPais() throws PaisMalConfiguradoException{
        if(this.ip.ip() < 50){
            return "Argentina";
        }
        if(this.ip.ip() > 50 && this.ip.ip() < 99){
            return "Brasil";
        }
        if(this.ip.ip() > 100 && this.ip.ip() < 149){
            return "Colombia";
        }

        throw new PaisMalConfiguradoException("El pais esta mal configurado");
    }


}

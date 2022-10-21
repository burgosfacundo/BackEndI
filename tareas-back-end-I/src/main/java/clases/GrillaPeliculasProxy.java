package clases;

import interfaces.IGrillaPeliculas;


public class GrillaPeliculasProxy implements IGrillaPeliculas  {

    private final GrillaPelicula pelicula = new GrillaPelicula();
    private final Ip ip;

    public GrillaPeliculasProxy(Ip ip) {
        this.ip = ip;
    }

    @Override
    public Pelicula getPeliculas(String nombre) throws PeliculaNoHabilitadaException, PaisMalConfiguradoException, PeliculaInexistenteException {

        if (this.obtenerPais().equals(this.pelicula.getPeliculas(nombre).getPais())){
            return this.pelicula.getPeliculas(nombre);
        }
        throw new PeliculaNoHabilitadaException("La pelicula no esta habilitada para ese pais.");
    }

    String obtenerPais() throws PaisMalConfiguradoException{
        if(this.ip.getIp() < 50){
            return "Argentina";
        }
        if(this.ip.getIp() > 50 && this.ip.getIp() < 99){
            return "Brasil";
        }
        if(this.ip.getIp() > 100 && this.ip.getIp() < 149){
            return "Colombia";
        }

        throw new PaisMalConfiguradoException("El pais esta mal configurado");
    }


}

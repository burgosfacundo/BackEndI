import clases.*;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GrillaPeliculaProxyTest {
    @Test
    @DisplayName("When method getPelicula is called with a correct movie")
    void getPeliculaTest1() throws PeliculaNoHabilitadaException, PaisMalConfiguradoException, PeliculaInexistenteException {
        //GIVEN
        var grilla = new GrillaPelicula();

        var peli = new Pelicula("Spiderman","Argentina","hhtps://www.spiderman.com");
        var peli2 = new Pelicula("Spiderman 2","Argentina","hhtps://www.spiderman2.com");

        grilla.addPelicula(peli);
        grilla.addPelicula(peli2);

        var ip = new Ip(30);

        var proxy = new GrillaPeliculasProxy(ip, grilla);

        //WHEN
        var actual = proxy.getPeliculas("Spiderman 2");
        //THEN
        assertEquals(actual,peli2);

    }

    @Test
    @DisplayName("When method getPelicula is called with a non-existent movie")
    void getPeliculaTest2(){
        //GIVEN
        var grilla = new GrillaPelicula();

        var peli = new Pelicula("Spiderman","Argentina","hhtps://www.spiderman.com");
        var peli2 = new Pelicula("Spiderman 2","Argentina","hhtps://www.spiderman2.com");

        grilla.addPelicula(peli);
        grilla.addPelicula(peli2);

        var ip = new Ip(30);

        var proxy = new GrillaPeliculasProxy(ip, grilla);

        //WHEN AND THEN
        assertThrows(PeliculaInexistenteException.class, () -> proxy.getPeliculas("Spiderman 5"));

    }

    @Test
    @DisplayName("When method getPelicula is called with a movie not enabled")
    void getPeliculaTest3(){
        //GIVEN
        var grilla = new GrillaPelicula();

        var peli = new Pelicula("Spiderman","Brasil","hhtps://www.spiderman.com");
        var peli2 = new Pelicula("Spiderman 2","Argentina","hhtps://www.spiderman2.com");

        grilla.addPelicula(peli);
        grilla.addPelicula(peli2);

        var ip = new Ip(30);

        var proxy = new GrillaPeliculasProxy(ip, grilla);

        //WHEN AND THEN
        assertThrows(PeliculaNoHabilitadaException.class, () -> proxy.getPeliculas("Spiderman"));

    }

    @Test
    @DisplayName("When method obtenerPais is called with a ip incorrect")
    void obtenerPais(){
        //GIVEN
        var grilla = new GrillaPelicula();
        var ip = new Ip(500);
        var proxy = new GrillaPeliculasProxy(ip,grilla);

        //WHEN AND THEN
        assertThrows(PaisMalConfiguradoException.class, proxy::obtenerPais);


    }

}

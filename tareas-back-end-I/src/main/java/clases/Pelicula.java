package clases;

public class Pelicula {
    private final String nombre, pais, link;

    public Pelicula(String nombre, String pais, String link) {
        this.nombre = nombre;
        this.pais = pais;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

}

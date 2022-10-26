package clases;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceVuelo {

    private final List<Vuelo> vuelos = new ArrayList<>();

    public List<Vuelo> buscarVuelo(String salida, String regreso, String origen, String destino){
        return this.vuelos.stream().filter(vuelo -> vuelo.salida().equals(salida) && vuelo.regreso().equals(regreso) && vuelo.origen().equals(origen) && vuelo.destino().equals(destino)).collect(Collectors.toList());
    }


    public void addVuelo(Vuelo vuelo){
        this.vuelos.add(vuelo);
    }
}

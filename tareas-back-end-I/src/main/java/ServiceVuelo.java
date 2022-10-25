import java.util.ArrayList;

public class ServiceVuelo {

    private final ArrayList<Vuelo> vuelos;

    public ServiceVuelo(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public ArrayList<Vuelo> buscarVuelo(String salida,String regreso, String origen, String destino){

        ArrayList<Vuelo> vuelos1 = new ArrayList<>();

        for (Vuelo vuelo: this.vuelos){
            if(vuelo.salida().equals(salida) && vuelo.regreso().equals(regreso) && vuelo.origen().equals(origen) && vuelo.destino().equals(destino)){
                vuelos1.add(vuelo);
            }
        }

        return vuelos1;
    }


}

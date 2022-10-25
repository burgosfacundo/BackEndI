package clases;

import interfaces.IBuscar;

import java.util.ArrayList;

public class ServiceTurismo implements IBuscar {

    private final ServiceVuelo serviceVuelo;
    private final ServiceHotel serviceHotel;
    public ServiceTurismo(ServiceVuelo serviceVuelo, ServiceHotel serviceHotel) {
        this.serviceHotel = serviceHotel;
        this.serviceVuelo = serviceVuelo;
    }

    @Override
    public String buscar(String origen,String destino, String salida, String regreso) {

        ArrayList<Vuelo> vuelos = this.serviceVuelo.buscarVuelo(salida,regreso,origen,destino);
        ArrayList<Hotel> hoteles = this.serviceHotel.buscarHotel(salida,regreso,destino);

        return "Los vuelos disponibles son:" + vuelos + " y los hoteles son: " + hoteles ;
    }
}

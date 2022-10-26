package clases;

import interfaces.IBuscar;

import java.util.List;

public class ServiceTurismo implements IBuscar {

    private final ServiceVuelo serviceVuelo;
    private final ServiceHotel serviceHotel;
    public ServiceTurismo(ServiceVuelo serviceVuelo, ServiceHotel serviceHotel) {
        this.serviceHotel = serviceHotel;
        this.serviceVuelo = serviceVuelo;
    }

    @Override
    public String buscar(String origen,String destino, String salida, String regreso) {

        List<Vuelo> vuelos = this.serviceVuelo.buscarVuelo(salida,regreso,origen,destino);
        List<Hotel> hoteles = this.serviceHotel.buscarHotel(salida,regreso,destino);

        return "Los vuelos disponibles son:" + vuelos + " y los hoteles son: " + hoteles ;
    }
}

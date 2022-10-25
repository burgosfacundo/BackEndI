import clases.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTurismoTest {


    @Test
    @DisplayName("WHEN a client calls buscar method THEN it returns the correct String")
    public void test(){
        //GIVEN
        var ciudad = "buenos aires" ;
        var destino = "cordoba";
        var salida = "25/10/2022";
        var regreso = "12/11/2022";

        var hotel = new Hotel(destino,salida,regreso);
        var vuelo = new Vuelo(ciudad,salida,regreso,destino);

        var arrayVuelos = new ArrayList<Vuelo>();
        var arrayHoteles = new ArrayList<Hotel>();

        arrayVuelos.add(vuelo);
        arrayHoteles.add(hotel);

        var serviceHotel = new ServiceHotel(arrayHoteles);
        var serviceVuelo = new ServiceVuelo(arrayVuelos);
        var service = new ServiceTurismo(serviceVuelo,serviceHotel);

        //WHEN
        var turismo = service.buscar(ciudad,destino,salida,regreso);
        //THEN
        assertEquals(turismo,"Los vuelos disponibles son: " + salida + " y " + regreso + " y los hoteles son: " + destino );

    }
}

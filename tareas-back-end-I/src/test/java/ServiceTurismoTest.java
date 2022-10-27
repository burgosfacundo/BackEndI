import clases.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ServiceTurismoTest {

    @Test
    @DisplayName("WHEN ServiceTurismo class calls buscarVuelo and buscarHotel methods THEN these are called correctly")
    public void test(){
        //GIVEN
        Hotel hotel1 = new Hotel("Buenos Aires", "17/11/2022", "26/12/2022");
        Hotel hotel2 = new Hotel("Buenos Aires", "17/11/2022", "21/11/2022");
        Hotel hotel3 = new Hotel("Doha", "17/11/2022", "24/12/2022");

        Vuelo vuelo1 = new Vuelo("Buenos Aires", "25/11/2022", "26/12/2022", "Barcelona");
        Vuelo vuelo2 = new Vuelo("Buenos Aires", "17/11/2022", "24/12/2022", "Doha");
        Vuelo vuelo3 = new Vuelo("Doha", "9/01/2023", "17/01/2023", "Buenos Aires");


        ServiceHotel serviceHotel = mock(ServiceHotel.class);
        ServiceVuelo serviceVuelo = mock(ServiceVuelo.class);

        serviceVuelo.addVuelo(vuelo1);
        serviceVuelo.addVuelo(vuelo2);
        serviceVuelo.addVuelo(vuelo3);

        serviceHotel.addHotel(hotel1);
        serviceHotel.addHotel(hotel2);
        serviceHotel.addHotel(hotel3);

        ServiceTurismo service = new ServiceTurismo(serviceVuelo,serviceHotel);

        //WHEN
        service.buscar("Buenos Aires","Doha","17/11/2022","24/12/2022");
        //THEN
        verify(serviceVuelo).buscarVuelo("17/11/2022","24/12/2022","Buenos Aires","Doha");
        verify(serviceHotel).buscarHotel("17/11/2022","24/12/2022","Doha");

    }

}

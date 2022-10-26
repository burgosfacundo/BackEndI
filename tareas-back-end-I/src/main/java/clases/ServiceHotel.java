package clases;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceHotel {

    private final List<Hotel> hoteles = new ArrayList<>();


    public List<Hotel> buscarHotel(String salida, String regreso, String ciudad){
        return this.hoteles.stream().filter(hotel -> hotel.salida().equals(salida) && hotel.regreso().equals(regreso) && hotel.destino().equals(ciudad)).collect(Collectors.toList());
    }


    public void addHotel(Hotel hotel){
        this.hoteles.add(hotel);
    }
}

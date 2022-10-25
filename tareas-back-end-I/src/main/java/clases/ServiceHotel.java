package clases;


import java.util.ArrayList;

public class ServiceHotel {

    private final ArrayList<Hotel> hoteles;

    public ServiceHotel(ArrayList<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public ArrayList<Hotel> buscarHotel(String salida, String regreso, String ciudad){

        ArrayList<Hotel> hoteles1= new ArrayList<>();

        siHotelExiste(salida, regreso, ciudad, hoteles1);

        return hoteles1;
    }

    private void siHotelExiste(String salida, String regreso, String ciudad, ArrayList<Hotel> hoteles1) {
        for(Hotel hotel:this.hoteles){
            if(hotel.salida().equals(salida) && hotel.regreso().equals(regreso) && hotel.destino().equals(ciudad)){
                hoteles1.add(hotel);
            }
        }
    }
}

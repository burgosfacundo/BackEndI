package clases;

import java.util.HashMap;
import java.util.Map;

public class RopaFactory {

    public Map<String,Ropa> ropas =new HashMap<>();



    public Ropa getRopa(String talle, String tipo, Boolean esImportado, Boolean esNuevo){

        Ropa ropa = ropas.get(tipo);

        if(ropa == null){
            ropa = new Ropa(talle,tipo,esImportado,esNuevo);
            ropas.put(tipo,ropa);
        }

        return ropa;
    }
}

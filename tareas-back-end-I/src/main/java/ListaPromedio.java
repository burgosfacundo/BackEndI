import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ListaPromedio {

    private static final Logger logger = LogManager.getLogger(ListaPromedio.class);
    private final List<Integer> listaEnteros;

    public ListaPromedio(List<Integer> listaEnteros) throws Exception {
        this.listaEnteros = listaEnteros;

        if(this.listaEnteros.size() > 5){
            logger.info("La longitud de la lista es mayor a 5");
        }
        if(this.listaEnteros.size() > 10){
            logger.info("La longitud de la lista es mayor a 10");
        }
        if (this.listaEnteros.size() == 0){
            logger.error("La lista es igual a cero");
            throw new Exception();
        }
    }

    public int promedio(){

        int sum =0;
        for (int num : this.listaEnteros) {
            sum +=num;
        }

        int promedio = sum / this.listaEnteros.size();
        logger.info("El promedio es: " + promedio);

        return promedio;
    }
}

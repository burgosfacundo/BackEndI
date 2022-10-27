import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    private final static String log4ConfigFile = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "log4j2.xml";

    public static void main(String[] args) throws Exception {
        var source = new ConfigurationSource(new FileInputStream(log4ConfigFile));
        Configurator.initialize(null, source);

        var listaPromedioMayorA5 = new ListaPromedio(Arrays.asList(1,2,3,4,5,6));
        var listaPromedioMayorA10 = new ListaPromedio(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        var listaPromedioVacia = new ListaPromedio(new ArrayList<>());

        listaPromedioMayorA10.promedio();

    }
}

import clases.Ropa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RopaTest {


    @Test
    @DisplayName("WHEN obj ropa is created THEN parameters are the same that we expected")
    public void test(){
        //GIVEN
        var talle = "s";
        var tipo = "pantalon";
        var esNuevo = true;
        var esImportado = true;
        //WHEN

        var ropa = new Ropa(talle,tipo,esImportado,esNuevo);
        //THEN
        assertEquals(ropa.talle(),talle);
        assertEquals(ropa.tipo(),tipo);
        assertEquals(ropa.esImportado(),esImportado);
        assertEquals(ropa.esNuevo(),esNuevo);
    }
}

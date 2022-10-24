import clases.ArbolFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ArbolFactoryTest {
    @Test
    @DisplayName("WHEN a new obj Arbol is created THEN it should have the right parameters ")
    public void test(){
        //GIVEN
        var arbol1 = ArbolFactory.getArbol(500,300,"rojo");
        var arbol2 = ArbolFactory.getArbol(500,300,"rojo");

        //WHEN AND THEN
        assertSame(arbol1,arbol2);

    }
}

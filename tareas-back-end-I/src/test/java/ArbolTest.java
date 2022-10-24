import clases.Arbol;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArbolTest {
    @Test
    @DisplayName("WHEN a new obj Arbol is created THEN it should have the right parameters ")
    public void test(){
        //given
        int alto = 200;
        int horizontal = 400;
        String color= "verde";
        //when
        Arbol arbol1 = new Arbol(alto,horizontal,color);
        //then
        assertEquals(arbol1.alto(),alto);
        assertEquals(arbol1.horizontal(),horizontal);
        assertEquals(arbol1.color(),color);
    }
}


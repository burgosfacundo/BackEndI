import clases.RopaFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class RopaFactoryTest {


    @Test
    @DisplayName("WHEN we created the same obj THEN both obj consume the same memory spaces")
    public void test(){
        //GIVEN
        var factory = new RopaFactory();

        //WHEN
        var ropa1 = factory.getRopa("s","pantalon",true,true);
        var ropa2 = factory.getRopa("s","pantalon",true,true);

        //THEN
        assertSame(ropa1,ropa2);
    }
}

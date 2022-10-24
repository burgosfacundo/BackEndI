package clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArbolFactory {
    private static final Map<String, Arbol> hashArbol = new HashMap<>();

    public static Arbol getArbol(int alto, int horizontal, String color){
        Arbol arbol1 = hashArbol.get(color);
        if (Objects.isNull(arbol1)){
            arbol1 = new Arbol(alto, horizontal, color);
            hashArbol.put(color,arbol1);
            return arbol1;
        }
        return arbol1;
    }
}

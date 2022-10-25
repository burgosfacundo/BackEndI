package clases;

public class Bosque {

    public static void main(String[] args) {
        plantar();
    }
    public static void plantar(){
        for(int i = 1; i < 500000; i++){
            ArbolFactory.getArbol(500,300,"rojo");
            ArbolFactory.getArbol(200,400,"verde");
        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}

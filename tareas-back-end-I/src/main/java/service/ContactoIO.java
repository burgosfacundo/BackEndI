package service;

import model.Contacto;

import java.io.*;
import java.util.List;

public class ContactoIO {
    private static final String FILENAME = "contactos.dat";

    public static void write (List<Contacto> contactos){

        try(var fo = new FileOutputStream(FILENAME); var objOu = new ObjectOutputStream(fo)) {
            objOu.writeObject(contactos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Contacto> read(){
        try (var fi = new FileInputStream(FILENAME);
        var objIn = new ObjectInputStream(fi)){
             return ((List<Contacto>) objIn.readObject());
        }catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

import model.Contacto;
import service.ContactoIO;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var contacto1 = new Contacto("Lucas","lucas@gmail.com","22354526");
        var contacto2 = new Contacto("Facundo","fa@gmail.com","6541");
        var contacto3 = new Contacto("Fran","fran@gmail.com","225554526");


        ContactoIO.write(Arrays.asList(contacto1,contacto2,contacto3));

        var contactos2 = ContactoIO.read();

        contactos2.forEach(System.out::println);

    }
}

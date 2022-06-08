package exercises.exercise11;

import observer.example.Persona;

public class Client {
    public static void main (String [] args){
        Compania companiaTelefonica = new Compania();
        Persona p1 = new Persona("147", "Camilo");
        Persona p2 = new Persona("258", "Cristian");
        Persona p3 = new Persona("369", "Valeria");

        // Ejemplo1
        companiaTelefonica.notification(new User("Promociones", p1));
        companiaTelefonica.notification(new User("Premios", p1));

        // Ejemplo2
        companiaTelefonica.notification(new User("Noticias", p2));

        // Ejemplo3
        companiaTelefonica.notification(new User("Promociones", p3));
        companiaTelefonica.notification(new User("Premios", p3));
        companiaTelefonica.notification(new User("Noticias", p3));
        companiaTelefonica.notification(new User("Precios Llamada", p3));


        companiaTelefonica.sendNotification(new Notificacion("Promociones", "Recarga 20Bs y recibe 2Bs de regalo!!"));
        companiaTelefonica.sendNotification(new Notificacion("Premios", "Felicidades!!! Ganaste 5Bs de crédito para tu celular"));
        companiaTelefonica.sendNotification(new Notificacion("Noticias", "IMPORTANTE: Línea en corte"));
        companiaTelefonica.sendNotification(new Notificacion("Precios Llamada", "Su última llamada costo 30ctvs."));
    }
}
package exercises.exercise11;

import observer.example.Persona;

public class User implements IUser {
    String notificacion;
    Persona persona;

    public User(String notificacion, Persona persona) {
        this.notificacion = notificacion;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificacion newNotificacion) {
        System.out.println("***** " + msg + " *****");
        System.out.println("Tipo de notificación > " + notificacion);
        System.out.println("Cliente > " + persona.getName());
        newNotificacion.showInfo();
    }

    @Override
    public String getPreferenciaNotificacion() {
        return notificacion;
    }
}

package exercises.exercise7;

public class DEV extends Persona {
    private String lenguaje;

    public DEV(IMediator mediator) {
        super(mediator);
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre: " + getName() + ", Cargo: " + getCargo() + ", Lenguaje: " + lenguaje);
        System.out.println("Mensaje recibido: " + msg);
    }
}

package mediator.example;

public class Profesional extends Persona {

    public Profesional(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre: " + getName() + ", Cargo: " + getCargo());
        System.out.println("Mensaje recibido: " + msg);
    }
}

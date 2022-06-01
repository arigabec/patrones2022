package exercises.exercise7;

public class QA extends Persona {
    private String grado;

    public QA(IMediator mediator) {
        super(mediator);
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre: " + getName() + ", Cargo: " + getCargo() + ", Grado: " + grado);
        System.out.println("Mensaje recibido: " + msg);
    }
}

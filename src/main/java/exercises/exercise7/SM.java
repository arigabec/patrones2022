package exercises.exercise7;

public class SM extends Persona {
    private String certificaciones;

    public SM(IMediator mediator) {
        super(mediator);
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre: " + getName() + ", Cargo: " + getCargo() + ", Certificaciones: " + certificaciones);
        System.out.println("Mensaje recibido: " + msg);
    }
}

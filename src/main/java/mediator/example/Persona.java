package mediator.example;

public abstract class Persona {
    protected IMediator mediator;
    private String name;
    private String ci;
    private String cargo;

    public Persona(IMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}

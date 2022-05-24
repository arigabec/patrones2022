package builder.example;

public class I9Alto extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("I9Alto 45");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("I9Alto Luminoso");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("I9Alto Gamer");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("I9Alto 32 GB");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("I9Alto i9");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("I9Alto 16");
    }
}

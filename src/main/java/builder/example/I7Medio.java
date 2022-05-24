package builder.example;

public class I7Medio extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("I7Medio 32");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("I7Medio Luminoso");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("I7Medio Luminoso");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("I7Medio 16 GB");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("I7Medio i7");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("I7Medio 8");
    }
}

package builder.example;

public class I5GamaBaja extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("I5GamaBaja 24");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("I5GamaBaja Normal");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("I5GamaBaja Normal");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("I5GamaBaja 8 GB");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("I5GamaBaja i5");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("I5GamaBaja 4");
    }
}

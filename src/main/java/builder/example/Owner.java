package builder.example;

public class Owner {
    private BuilderComputadora builder;

    public Computadora getComputadoraArmada(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderComputadora builder){
        this.builder = builder;
    }

    public void buildComputadora(){
        this.builder.createComputadora();
        this.builder.buildMonitor();
        this.builder.buildTeclado();
        this.builder.buildMouse();
        this.builder.buildMemoria();
        this.builder.buildProcesador();
        this.builder.buildVideo();
    }
}

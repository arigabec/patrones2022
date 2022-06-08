package state.example;

public class Apagado implements IStateComputadora {
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        computadora.getTarjetaVideo().setCapacidadUtilizada(0);
        computadora.getMemoriaRam().setCapacidadUtilizada(0);
        System.out.println("Computadora apagada");
        computadora.getTarjetaVideo().showInfo();
        computadora.getMemoriaRam().showInfo();
    }
}

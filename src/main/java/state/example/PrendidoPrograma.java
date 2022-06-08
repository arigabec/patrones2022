package state.example;

import java.util.Random;

public class PrendidoPrograma implements IStateComputadora {
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        computadora.getMemoriaRam().setCapacidadUtilizada(new Random().nextInt(100));
        System.out.println("Memoria RAM utilizada por el programa: " + computadora.getMemoriaRam().getCapacidadUtilizada());
        computadora.getMemoriaRam().showInfo();
    }
}

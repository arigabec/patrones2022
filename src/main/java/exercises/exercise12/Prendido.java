package exercises.exercise12;

import java.util.Random;

public class Prendido implements IStateComputadora {

    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("<< COMPUTADORA EN USO >>");
        double currentValue = computadora.getCpu().getCapacidadUtilizada();
        int programasAbiertos = new Random().nextInt(10);
        computadora.getProgramas().setProgramasUtilizados("Están en uso " + programasAbiertos + " programas");
        System.out.println(computadora.getProgramas().getProgramasUtilizados());
        while (currentValue < 100){
            Thread.sleep(5000);
            computadora.getCpu().showInfo();
            currentValue = currentValue + (double) programasAbiertos * 5 / 100;
            computadora.getCpu().setCapacidadUtilizada(currentValue);
        }
        System.out.println("100% de uso de la CPU");
    }
}

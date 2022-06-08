package state.example;

public class PrendidoMinando implements IStateComputadora {
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        int currentValue = computadora.getTarjetaVideo().getCapacidadUtilizada();
        while (currentValue < 100){
            computadora.getTarjetaVideo().showInfo();
            Thread.sleep(5000);
            currentValue = currentValue + 5;
            computadora.getTarjetaVideo().setCapacidadUtilizada(currentValue);
        }
        System.out.println("100% de uso de la tarjeta de video");
    }
}

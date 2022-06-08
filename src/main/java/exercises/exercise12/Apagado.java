package exercises.exercise12;

public class Apagado implements IStateComputadora {

    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("<< APAGANDO >>");
        computadora.getMemoriaRam().setCapacidadUtilizada(0);
        computadora.getCpu().setCapacidadUtilizada(0);
        computadora.getMemoriaRam().showInfo();
        computadora.getCpu().showInfo();
        computadora.getProgramas().showInfo();
    }
}

package bridge.noBridge;

public class Circulo implements IFigura {
    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintarRojo() {
        System.out.println("Pintando circulo de color rojo");
    }

    @Override
    public void pintarAzul() {
        System.out.println("Pintando circulo de color azul");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Pintando circulo de color verde");
    }
}

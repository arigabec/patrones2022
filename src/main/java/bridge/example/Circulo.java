package bridge.example;

public class Circulo implements IFigure {
    private IColor color;

    public Circulo(IColor color) {
        this.color = color;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando circulo: ");
        color.pintar();
    }
}

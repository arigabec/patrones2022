package factoryMethod.example.heladeria;

public class HeladoAgua implements IHelado {
    private String size;
    private String shape;
    private Fruta fruta;
    private Base base;

    public HeladoAgua(Fruta fruta, Base base) {
        this.fruta = fruta;
        this.base = base;
    }

    @Override
    public void showInfo() {
        System.out.println("HELADO MIXTO: ");
        System.out.println("Tamaño: " + size);
        System.out.println("Forma: " + shape);
        System.out.println("Fruta: " + fruta.getNombre());
        System.out.println("Base: " + base.getNombre());
        System.out.println();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}

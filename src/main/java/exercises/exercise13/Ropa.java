package exercises.exercise13;

public class Ropa {
    String tipo;
    String color;
    int precioOriginal;
    int precioTemporada;

    public Ropa(String tipo, String color, int precioActual) {
        this.tipo = tipo;
        this.color = color;
        this.precioOriginal = precioActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(int precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public int getPrecioTemporada() {
        return precioTemporada;
    }

    public void setPrecioTemporada(int precioTemporada) {
        this.precioTemporada = precioTemporada;
    }

    public void showInfo(){
        System.out.println("Prenda: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Precio original: " + precioOriginal + "Bs");
        System.out.println("Precio por temporada: " + precioTemporada + "Bs");
        System.out.println();
    }
}

package exercises.exercise15;

public class Celular implements IEmpresa1 {
    private int precio;
    private int tiempoDeVida;

    public Celular(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("El precio del celular es de " + precio + " Bs");
    }

    @Override
    public void showTiempo() {
        System.out.println("El tiempo de vida del celular es de " + tiempoDeVida + " años");
    }
}

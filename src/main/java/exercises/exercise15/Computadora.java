package exercises.exercise15;

public class Computadora implements IEmpresa1 {
    private int precio;
    private int tiempoDeVida;

    public Computadora(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("El precio de la computadora es de " + precio + " Bs");
    }

    @Override
    public void showTiempo() {
        System.out.println("El tiempo de vida de la computadora es de " + tiempoDeVida + " años");
    }
}

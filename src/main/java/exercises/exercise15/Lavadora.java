package exercises.exercise15;

public class Lavadora implements IEmpresa2 {
    private int precio;
    private int tiempoDeGarantia;

    public Lavadora(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("El precio de la lavadora es de " + precio + " Bs");
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("El tiempo de garantía de la lavadora es de " + tiempoDeGarantia + " años");
    }
}

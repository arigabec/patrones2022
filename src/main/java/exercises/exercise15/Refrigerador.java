package exercises.exercise15;

public class Refrigerador implements IEmpresa2 {
    private int precio;
    private int tiempoDeGarantia;

    public Refrigerador(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("El precio del refrigerador es de " + precio + " Bs");
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("El tiempo de garantía del refrigerador es de " + tiempoDeGarantia + " años");
    }
}

package exercises.exercise15;

public class Televisor implements IEmpresa2 {
    private int precio;
    private int tiempoDeGarantia;

    public Televisor(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("El precio del televisor es de " + precio + " Bs");
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("El tiempo de garantía del televisor es de " + tiempoDeGarantia + " años");
    }
}

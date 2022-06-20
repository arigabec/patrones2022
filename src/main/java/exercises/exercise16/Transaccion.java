package exercises.exercise16;

public class Transaccion {
    private int monto;
    private String moneda;

    public Transaccion(int monto, String moneda) {
        this.monto = monto;
        this.moneda = moneda;
    }

    public int getMonto() {
        return monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void showInfo(){
        System.out.println("Transaccion: " + monto + " " + moneda);
    }
}

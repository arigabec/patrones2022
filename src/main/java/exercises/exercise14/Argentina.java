package exercises.exercise14;

public class Argentina implements IPais {
    private String moneda;
    private int monto;

    public Argentina(){}

    @Override
    public void aceptar(IVisitante visitante) {
        visitante.cambiarDineroArgentina(this);
    }

    @Override
    public void setCambio(int monto, String moneda) {
        this.moneda = moneda;
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public int getMonto() {
        return monto;
    }
}

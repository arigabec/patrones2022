package exercises.exercise15;

public class Artefacto implements IEmpresa1 {
    private IEmpresa2 artefacto;

    public Artefacto(IEmpresa2 artefacto) {
        this.artefacto = artefacto;
    }

    @Override
    public void showPrecio() {
        artefacto.showCosto();
    }

    @Override
    public void showTiempo() {
        artefacto.showTiempoDeGarantia();
    }
}

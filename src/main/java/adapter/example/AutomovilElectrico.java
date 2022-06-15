package adapter.example;

public class AutomovilElectrico implements IAutomovil {
    private Automovil automovil;

    public AutomovilElectrico(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public void encender() {
        automovil.encender();
    }

    @Override
    public void avanzar(int tiempo) throws InterruptedException {
        automovil.funcionando(tiempo);
    }

    @Override
    public void cargarCombustible(int tiempo) throws InterruptedException {
        automovil.cargando(tiempo);
    }
}

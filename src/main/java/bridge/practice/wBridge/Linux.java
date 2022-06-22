package bridge.practice.wBridge;

public class Linux implements IPlataforma {
    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void iniciarSO() {
        System.out.println("Iniciando Linux ... ");
        arquitectura.iniciarArquitectura();
    }
}

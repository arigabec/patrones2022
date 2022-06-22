package bridge.practice.wBridge;

public class Windows implements IPlataforma {
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void iniciarSO() {
        System.out.println("Iniciando Windows ... ");
        arquitectura.iniciarArquitectura();
    }
}

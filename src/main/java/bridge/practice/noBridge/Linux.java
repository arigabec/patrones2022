package bridge.practice.noBridge;

public class Linux implements IPlataforma {
    @Override
    public void iniciarSO() {
        System.out.println("Iniciando Linux");
    }

    @Override
    public void x86() {
        System.out.println("Iniciando Linux x86");
    }

    @Override
    public void x64() {
        System.out.println("Iniciando Linux x64");
    }
}

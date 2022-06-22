package bridge.practice.noBridge;

public class Windows implements IPlataforma {
    @Override
    public void iniciarSO() {
        System.out.println("Iniciando Windows");
    }

    @Override
    public void x86() {
        System.out.println("Iniciando Windows x86");
    }

    @Override
    public void x64() {
        System.out.println("Iniciando Windows x64");
    }
}

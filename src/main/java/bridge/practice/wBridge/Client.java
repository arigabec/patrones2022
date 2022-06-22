package bridge.practice.wBridge;

public class Client {
    public static void main(String[] args){
        IArquitectura a64 = new X64();
        IArquitectura a86 = new X86();

        IPlataforma windows1 = new Windows(a64);
        windows1.iniciarSO();

        IPlataforma linux1 = new Linux(a86);
        linux1.iniciarSO();
    }
}

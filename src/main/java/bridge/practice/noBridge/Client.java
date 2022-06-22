package bridge.practice.noBridge;
public class Client {
    public static void main(String[] args){
        Windows windows = new Windows();
        windows.iniciarSO();
        windows.x64();
        windows.x86();

        Linux linux = new Linux();
        linux.iniciarSO();
        linux.x64();
        linux.x86();
    }
}

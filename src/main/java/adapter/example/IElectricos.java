package adapter.example;

public interface IElectricos {
    void encender();
    void funcionando(int tiempo) throws InterruptedException;
    void cargando(int tiempo) throws InterruptedException;
    void estadoBateria();
}

package adapter.example;

public interface IAutomovil {
    void encender();
    void avanzar(int tiempo) throws InterruptedException;
    void cargarCombustible(int tiempo) throws InterruptedException;
}

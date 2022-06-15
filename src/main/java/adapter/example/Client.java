package adapter.example;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        IAutomovil autoG = new Gasolina();
        IAutomovil autoGE = new GasolinaEspecial();
        IAutomovil autoD = new Diesel();
        IAutomovil autoE = new AutomovilElectrico(new Automovil());

        autoG.encender();
        autoG.avanzar(15);
        autoG.cargarCombustible(5);

        autoE.encender();
        autoE.avanzar(15);
        autoE.cargarCombustible(5);
    }
}

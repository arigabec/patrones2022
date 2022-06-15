package adapter.example;

public class Gasolina implements IAutomovil {
    private int combustible;

    public Gasolina() {
        combustible = 4;
    }

    @Override
    public void encender() {
        // al encender se verifica el tanque de combustible
        System.out.println("Gasolina > Combustible Actual > " + combustible);
    }

    @Override
    public void avanzar(int tiempo) throws InterruptedException {
        // al avanzar el tanque va arebajando en 5 unidades cada 5 seg
        for (int i = 0; i < tiempo; i++){
            Thread.sleep(5000);
            combustible = combustible - 5;
            if (combustible <= 0){
                System.out.println("Gasolina > Se acabo el combustible!");
                combustible = 0;
                break;
            }
            System.out.println("Gasolina > Combustible Actual > " + combustible);
        }
    }

    @Override
    public void cargarCombustible(int tiempo) {
        // cuando carga combustible, el combustible incrementa
        for (int i = 0; i < tiempo; i++){
            combustible = combustible + 4;
            System.out.println("Gasolina > Cargando combustible ...");
            if (combustible >= 100){
                System.out.println("Gasolina > Tanque lleno!");
                combustible = 100;
                break;
            }
        }
        System.out.println("Gasolina > Combustible Actual > " + combustible);
    }
}

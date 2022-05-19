package exercises.exercise1;

public class Client {
    public static void main(String[] args){
        Person carla = new Person();
        carla.setName("Carla");
        carla.setCi("5896984");

        Person eduardo = new Person();
        eduardo.setName("Eduardo");
        eduardo.setCi("5784631");

        Person luis = new Person();
        luis.setName("Luis");
        luis.setCi("4635120");

        Banco banco1 = new Banco(carla, "BNB");
        banco1.cambiarDineroBanco(70, "Boliviano", "Dolar");
        banco1.cambiarDineroBanco(200, "Dolar", "Boliviano");
        banco1.cambiarDineroBanco(1, "Dolar", "Dolar");

        LibreCambista libreCambista1 = new LibreCambista(eduardo);
        libreCambista1.cambiarDineroLC(70, "Boliviano", "Dolar");
        libreCambista1.cambiarDineroLC(1, "Euro", "Boliviano");
        libreCambista1.cambiarDineroLC(300, "Boliviano", "Euro");

        CasaDeCambio casaDeCambio1 = new CasaDeCambio(luis);
        casaDeCambio1.cambiarDineroCC(70, "Boliviano", "Sol");
        casaDeCambio1.cambiarDineroCC(10, "Dolar", "Boliviano");
        casaDeCambio1.cambiarDineroCC(1500, "Boliviano", "Dolar");
    }
}

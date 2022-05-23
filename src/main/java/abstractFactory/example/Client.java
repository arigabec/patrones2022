package abstractFactory.example;

public class Client {
    public static void main(String[] args){
        IPasaje pasaje = FactoryPasaje.make(TipoPasaje.SOLIDARIO);
        pasaje.showInfo();

        IPasaje pasaje1 = FactoryPasaje.make(TipoPasaje.INFANTES);
        pasaje1.showInfo();

        IPasaje pasaje2 = FactoryPasaje.make(TipoPasaje.STANDAR);
        pasaje2.showInfo();
    }
}

package singleton.example.bank;

public class Cajero {
    private String numeroCajero;
    private Person person;

    public Cajero(Person person, String numeroCajero){
        this.person=person;
        this.numeroCajero=numeroCajero;
    }

    public void retirarDineroTarjeta(int cantidad){
        AccountAdmin.getInstance().retiroDinero(cantidad);
    }
}

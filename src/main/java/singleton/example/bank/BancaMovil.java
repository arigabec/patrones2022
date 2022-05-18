package singleton.example.bank;

public class BancaMovil {
    private String name;
    private Person person;

    public BancaMovil(Person person, String name){
        this.person=person;
        this.name=name;
    }

    public void retirarDineroOnline(int cantidad){
        AccountAdmin.getInstance().retiroDinero(cantidad);
    }
}

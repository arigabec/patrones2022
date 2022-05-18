package singleton.example.bank;

public class Sucursal {
    private String name;
    private Person person;

    public Sucursal(Person person, String name){
        this.person=person;
        this.name=name;
    }

    public void retirarDineroSucursal(int cantidad){
        AccountAdmin.getInstance().retiroDinero(cantidad);
    }
}

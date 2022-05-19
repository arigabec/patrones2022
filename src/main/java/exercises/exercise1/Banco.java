package exercises.exercise1;

public class Banco {
    private Person person;
    private String name;

    public Banco(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    public void cambiarDineroBanco(int cantidad, String tipoEntregado, String tipoACambiar){
        System.out.println(person.getName() + " solicita cambiar en el banco " + name + ": " + tipoEntregado + " a " + tipoACambiar);
        TipoDeCambio.getInstance().cambiarDinero(cantidad, tipoEntregado, tipoACambiar);
        System.out.println();
    }
}

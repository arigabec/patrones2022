package exercises.exercise1;

public class CasaDeCambio {
    private Person person;

    public CasaDeCambio(Person person) {
        this.person = person;
    }

    public void cambiarDineroCC(int cantidad, String tipoEntregado, String tipoACambiar){
        System.out.println(person.getName() + " solicita cambiar en una casa de cambio: " + tipoEntregado + " a " + tipoACambiar);
        TipoDeCambio.getInstance().cambiarDinero(cantidad, tipoEntregado, tipoACambiar);
        System.out.println();
    }
}

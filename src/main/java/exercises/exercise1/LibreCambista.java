package exercises.exercise1;

public class LibreCambista {
    private Person person;

    public LibreCambista(Person person) {
        this.person = person;
    }

    public void cambiarDineroLC(int cantidad, String tipoEntregado, String tipoACambiar){
        System.out.println(person.getName() + " solicita cambiar con un libre cambista: " + tipoEntregado + " a " + tipoACambiar);
        TipoDeCambio.getInstance().cambiarDinero(cantidad, tipoEntregado, tipoACambiar);
        System.out.println();
    }
}

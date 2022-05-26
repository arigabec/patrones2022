package exercises.exercisesP1.E1;

public class Ventanilla {
    private Person person;

    public Ventanilla(Person person) {
        this.person = person;
    }

    public void pagarMatricula(int monto){
        Sistema.getInstance().recibirDinero(monto);
    }

    public void iniciarSesionCajero(){
        Sistema.getInstance().iniciarSesion(person.getNombre(), person.getCodigo());
    }

    public void mostrarDinero(){
        Sistema.getInstance().mostrarMontoActual();
    }
}

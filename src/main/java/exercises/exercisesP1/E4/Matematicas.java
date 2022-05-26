package exercises.exercisesP1.E4;

public class Matematicas implements IMateria {
    private Estudiante estudiante;

    public Matematicas(){}

    @Override
    public void inscribirse() {
        System.out.println("Inscribiendo a " + estudiante.getNombre() + " a la materia de Matematicas");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}

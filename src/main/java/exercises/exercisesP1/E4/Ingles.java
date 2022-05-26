package exercises.exercisesP1.E4;

public class Ingles implements IMateria {
    private Estudiante estudiante;

    public Ingles(){
    }

    @Override
    public void inscribirse() {
        System.out.println("Inscribiendo a " + estudiante.getNombre() + " a la materia de Ingles");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}

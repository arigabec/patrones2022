package exercises.exercisesP1.E4;

public class Historia implements IMateria {
    private Estudiante estudiante;

    public Historia(){
    }

    @Override
    public void inscribirse() {
        System.out.println("Inscribiendo a " + estudiante.getNombre() + " a la materia de Historia");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}

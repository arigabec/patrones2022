package exercises.exercisesP1.E4;

public class Client {
    public static void main(String[] args) {
        Estudiante luis = new Estudiante();
        luis.setNombre("Luis Mendez");
        luis.setCi("34521678");

        IMateria inscripcion1 = FactoryMateria.make("Matematicas");
        inscripcion1.registrarEstudiante(luis);
        inscripcion1.inscribirse();
    }
}

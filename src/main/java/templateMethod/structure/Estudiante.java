package templateMethod.structure;

public class Estudiante extends Persona {
    @Override
    void methodAbs1() {
        System.out.println("Esto es un metodo abstracto heredado (Abs1)");
    }

    @Override
    void methodAbs2() {
        System.out.println("Esto es un metodo abstracto heredado (Abs2)");
    }
}

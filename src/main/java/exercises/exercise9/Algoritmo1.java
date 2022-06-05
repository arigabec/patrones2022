package exercises.exercise9;

public class Algoritmo1 implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if (personas.length <= 20){
            bubbleSort(personas);
        } else {
            next.criteriaHandler(personas);
        }
    }

    private void bubbleSort(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
        System.out.println("Mostrando la lista ordenada por el ALGORITMO 1:");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("Nombre: " + personas[i].getNombre() + " - CI: " + personas[i].getCi() + " - Edad: " + personas[i].getEdad());
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}

package exercises.exercise9;

public class Algoritmo3 implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if (personas.length > 50){
            insertionSort(personas);
        } else {
            next.criteriaHandler(personas);
        }
    }

    private void insertionSort(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > key.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = key;
        }
        System.out.println("Mostrando la lista ordenada por el ALGORITMO 3:");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("Nombre: " + personas[i].getNombre() + " - CI: " + personas[i].getCi() + " - Edad: " + personas[i].getEdad());
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}

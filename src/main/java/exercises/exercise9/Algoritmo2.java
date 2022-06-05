package exercises.exercise9;

import java.util.Arrays;

public class Algoritmo2 implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if (personas.length > 20 && personas.length <= 50){
            selectionSort(personas);
        } else {
            next.criteriaHandler(personas);
        }
    }

    private void selectionSort(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < personas.length; j++)
                if (personas[j].getEdad() < personas[min_idx].getEdad()){
                    min_idx = j;
                }
            Persona temp = personas[min_idx];
            personas[min_idx] = personas[i];
            personas[i] = temp;
        }
        System.out.println("Mostrando la lista ordenada por el ALGORITMO 2:");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("Nombre: " + personas[i].getNombre() + " - CI: " + personas[i].getCi() + " - Edad: " + personas[i].getEdad());
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}

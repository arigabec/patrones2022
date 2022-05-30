package exercises.exercise6;

import java.util.Stack;

public class ConcreteIteratorImp4 implements Iterator {
    private Stack<Auto> listaAutos;

    public ConcreteIteratorImp4(Stack<Auto> listaDeAutos) {
        this.listaAutos = listaDeAutos;
    }

    @Override
    public Object next() {
        return listaAutos.pop();
    }

    @Override
    public boolean hasNext() {
        return !listaAutos.isEmpty();
    }
}

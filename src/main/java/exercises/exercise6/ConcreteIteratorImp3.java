package exercises.exercise6;

import java.util.Vector;

public class ConcreteIteratorImp3 implements Iterator {
    private int posicion;
    private Vector<Auto> listaAutos;

    public ConcreteIteratorImp3(Vector<Auto> listaDeAutos) {
        this.listaAutos = listaDeAutos;
        posicion = 0;
    }

    @Override
    public Object next() {
        return listaAutos.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return listaAutos.size() != 0 && posicion < listaAutos.size();
    }
}

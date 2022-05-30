package exercises.exercise6;

import java.util.Vector;

public class ConcreteImp3 implements IAggregate {
    private Vector<Auto> listaAutos;

    public ConcreteImp3(){
        listaAutos = new Vector<>();
    }

    public void add(Auto a){
        listaAutos.add(a);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImp3(listaAutos);
    }
}

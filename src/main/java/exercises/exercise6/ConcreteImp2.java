package exercises.exercise6;

import java.util.ArrayList;
import java.util.List;

public class ConcreteImp2 implements IAggregate {
    private List<Auto> listaDeAutos;

    public ConcreteImp2(){
        listaDeAutos = new ArrayList<>();
    }

    public void add(Auto a){
        listaDeAutos.add(a);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImp2(listaDeAutos);
    }
}

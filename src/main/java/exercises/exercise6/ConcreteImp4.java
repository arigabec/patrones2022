package exercises.exercise6;

import java.util.Stack;

public class ConcreteImp4 implements IAggregate {
    private Stack<Auto> listaAutos;

    public ConcreteImp4(){
        listaAutos = new Stack<Auto>();
    }

    public void add(Auto a){
        listaAutos.push(a);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImp4(listaAutos);
    }
}

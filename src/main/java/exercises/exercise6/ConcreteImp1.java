package exercises.exercise6;

public class ConcreteImp1 implements IAggregate {
    private int posicion;
    private Auto[] listaAutos;

    public ConcreteImp1(){
        listaAutos = new Auto[2];
    }

    public void add(Auto a){
        listaAutos[posicion] = a;
        posicion++;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImp1(listaAutos);
    }
}

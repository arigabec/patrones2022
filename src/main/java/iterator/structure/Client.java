package iterator.structure;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        ConcreteAggregateA bancoUnion = new ConcreteAggregateA();
        bancoUnion.add("Jose1");
        bancoUnion.add("Jose2");
        bancoUnion.add("Jose3");
        bancoUnion.add("Jose4");
        bancoUnion.add("Jose5");

        ConcreteAggregateB bancoBisa = new ConcreteAggregateB();
        bancoBisa.add("Juan1");
        bancoBisa.add("Juan2");
        bancoBisa.add("Juan3");
        bancoBisa.add("Juan4");
        bancoBisa.add("Juan5");

        Iterator iterator;
        iterator = bancoUnion.createIterator();
        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("Banco Union: " + client);
        }

        iterator = bancoBisa.createIterator();
        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("Banco Bisa: " + client);
        }

       /* Ya existen iterator y sus metodos:
       List<String> name = new ArrayList<>();
        name.iterator().hasNext(); */
    }
}

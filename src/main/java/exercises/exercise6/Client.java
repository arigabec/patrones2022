package exercises.exercise6;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args){
        ConcreteImp1 importadora1 = new ConcreteImp1();
        importadora1.add(new Auto(24000, "Mazda CX3", 5, "Vagoneta"));
        importadora1.add(new Auto(30000, "Toyota Hilux", 5, "Camioneta"));

        ConcreteImp2 importadora2 = new ConcreteImp2();
        importadora2.add(new Auto(17000, "Suzuki Jimny", 5, "Vagoneta"));
        importadora2.add(new Auto(12000, "Suzuki Alto", 5, "Auto"));

        ConcreteImp3 importadora3 = new ConcreteImp3();
        importadora3.add(new Auto(40000, "BMW 320", 5, "Auto"));
        importadora3.add(new Auto(35000, "Mazda BX50", 5, "Camioneta"));

        ConcreteImp4 importadora4 = new ConcreteImp4();
        importadora4.add(new Auto(13000, "Nissan March", 5, "Auto"));
        importadora4.add(new Auto(65000, "Mercedes GLA 250", 5, "Vagoneta"));

        Iterator iterator;
        Map<String, Auto> map = new HashMap<String, Auto>();

        iterator = importadora1.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        iterator = importadora2.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        iterator = importadora3.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        iterator = importadora4.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        System.out.println("LISTA DE AUTOS EXISTENTES: ");
        for (String key : map.keySet()) {
            System.out.println("- " + key);
        }
    }
}

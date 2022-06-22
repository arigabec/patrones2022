package bridge.structure;

public class Client {
    public static void main(String[] args){
        Implementor i1 = new Implementor1();
        ConcreteAbstraction c1 = new ConcreteAbstraction(i1);
        c1.method1();
        c1.method2();
    }
}

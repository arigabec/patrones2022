package adapter.structure;

public class Client {
    public static void main(String[] args){
        ElementConcreteA elementA = new ElementConcreteA();
        elementA.method1();
        elementA.method2("attr1", "attr1");

        Adaptee adaptee = new Adaptee();

        IAdapter elementAdapter = new ConcreteAdapter(adaptee);
        elementAdapter.method1();
        elementAdapter.method2("attr1", "attr2");
    }
}

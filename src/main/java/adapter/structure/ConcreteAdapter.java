package adapter.structure;

public class ConcreteAdapter implements IAdapter {
    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        this.adaptee.method1Action1();
    }

    @Override
    public void method2(String attr1, String attr2) {
        this.adaptee.method2Action2(attr1, attr2);
        this.adaptee.getAttr1();
    }
}

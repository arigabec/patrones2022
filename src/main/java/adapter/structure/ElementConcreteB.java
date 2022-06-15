package adapter.structure;

public class ElementConcreteB implements IAdapter {
    @Override
    public void method1() {
        System.out.println("ElementConcreteB > method1");
    }

    @Override
    public void method2(String attr1, String attr2) {
        System.out.println("ElementConcreteB > method2");
    }
}

package bridge.structure;

public class ConcreteAbstraction implements IAbstraction {
    private Implementor implementor;

    public ConcreteAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void method1() {
        this.implementor.operation1();
    }

    @Override
    public void method2() {
        this.implementor.operation2();
    }
}

package bridge.structure;

public class Implementor1 implements Implementor {
    @Override
    public void operation1() {
        System.out.println("Implementor1 > Operation1");
    }

    @Override
    public void operation2() {
        System.out.println("Implementor1 > Operation2");
    }
}

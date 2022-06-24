package decorator.structure;

public class ConcreteComponent implements IComponent {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent > Operation > Realizando operacion basica");
    }
}

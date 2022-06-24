package decorator.structure;

public class Client {
    public static void main(String[] args){
        IComponent component =new ConcreteComponent();

        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);

        component.operation();
    }
}

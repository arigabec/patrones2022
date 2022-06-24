package decorator.structure;

public class ConcreteDecorator1 extends Decorator {
    private String attr1;
    private String attr2;

    public ConcreteDecorator1(IComponent baseComponent) {
        super(baseComponent);
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    @Override
    public void operation(){
        super.operation();
        // Agregar lógica específica
        addedBehavior();
        attr1 = "Nuevo costo";
        System.out.println("Atributo1 > " + attr1);
    }

    public void addedBehavior(){
        System.out.println("Nuevo comportamiento");
    }
}

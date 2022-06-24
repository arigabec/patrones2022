package decorator.structure;

public class Decorator implements IComponent  {
    private IComponent baseComponent;
    // Añadir atributos

    public Decorator(IComponent baseComponent) {
        this.baseComponent = baseComponent;
    }

    @Override
    public void operation() {
        baseComponent.operation();
        // Agregar lógica genérica
    }
}

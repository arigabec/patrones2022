package exercises.exercise4;

public class Clasica extends BuilderPizza {
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Salsa de tomate, otros.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa especial.");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Doble queso mozarella (tipo 2).");
    }
}

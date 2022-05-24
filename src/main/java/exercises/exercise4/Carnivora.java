package exercises.exercise4;

public class Carnivora extends BuilderPizza {
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Carne, salsa de tomate, otros.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa especial.");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Queso mozarella.");
    }
}

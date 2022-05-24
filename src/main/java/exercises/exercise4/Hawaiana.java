package exercises.exercise4;

public class Hawaiana extends BuilderPizza {
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Piña, salsa de tomate, otros.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa normal.");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("Queso mozarella (tipo 2).");
    }
}

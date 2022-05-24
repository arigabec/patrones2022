package exercises.exercise4;

public class Owner {
    private BuilderPizza builder;

    public Pizza getPizzaPreparada(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderPizza builder){
        this.builder = builder;
    }

    public void buildPizza(){
        this.builder.createPizza();
        this.builder.buildIngredientes();
        this.builder.buildTipoMasa();
        this.builder.buildTipoQueso();
    }
}

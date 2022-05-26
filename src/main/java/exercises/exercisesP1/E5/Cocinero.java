package exercises.exercisesP1.E5;

public class Cocinero {
    private BuilderCarne builder;

    public Carne getProductBuilder(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderCarne builder){
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildTipoDeCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }
}

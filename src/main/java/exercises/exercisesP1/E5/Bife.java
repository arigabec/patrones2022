package exercises.exercisesP1.E5;

public class Bife extends BuilderCarne{
    @Override
    public void buildTipoDeCarne() {
        carne.setTipoDeCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        carne.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        carne.setGuarniciones("Papas fritas");
    }
}

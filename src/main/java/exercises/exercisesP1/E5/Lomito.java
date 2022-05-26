package exercises.exercisesP1.E5;

public class Lomito extends BuilderCarne{
    @Override
    public void buildTipoDeCarne() {
        carne.setTipoDeCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        carne.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        carne.setGuarniciones("Arroz");
    }
}

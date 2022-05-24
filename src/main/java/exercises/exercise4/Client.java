package exercises.exercise4;

public class Client {
    public static void main(String[] args){
        Owner camila = new Owner();
        BuilderPizza carnivora = new Carnivora();
        BuilderPizza hawaiana = new Hawaiana();
        BuilderPizza clasica = new Clasica();

        camila.setBuilder(carnivora);
        camila.buildPizza();
        Pizza p1 = camila.getPizzaPreparada();
        p1.showInfo();

        camila.setBuilder(hawaiana);
        camila.buildPizza();
        Pizza p2 = camila.getPizzaPreparada();
        p2.showInfo();

        camila.setBuilder(clasica);
        camila.buildPizza();
        Pizza p3 = camila.getPizzaPreparada();
        p3.showInfo();
    }
}

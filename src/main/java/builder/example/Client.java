package builder.example;

public class Client {
    public static void main(String[] args){
        Owner jose = new Owner();
        BuilderComputadora pcI9 = new I9Alto();
        BuilderComputadora pcI7 = new I7Medio();
        BuilderComputadora pcI5 = new I5GamaBaja();

        jose.setBuilder(pcI9);
        jose.buildComputadora();
        Computadora computadora1 = jose.getComputadoraArmada();
        computadora1.showInfo();

        jose.setBuilder(pcI7);
        jose.buildComputadora();
        Computadora computadora2 = jose.getComputadoraArmada();
        computadora2.showInfo();

        jose.setBuilder(pcI5);
        jose.buildComputadora();
        Computadora computadora3 = jose.getComputadoraArmada();
        computadora3.showInfo();
    }
}

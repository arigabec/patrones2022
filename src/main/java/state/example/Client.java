package state.example;

public class Client {

    public static void main (String[]args) throws InterruptedException {
        Computadora computer = new Computadora();
        computer.setStateComputadora(new PrendidoMinando());
        computer.resourceManager();
    }
}

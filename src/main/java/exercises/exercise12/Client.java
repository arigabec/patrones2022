package exercises.exercise12;

public class Client {

    public static void main (String[]args) throws InterruptedException {
        Computadora computer = new Computadora();
        computer.setState(new Prendido());
        computer.resourceManager();
    }
}

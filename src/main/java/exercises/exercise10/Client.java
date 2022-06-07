package exercises.exercise10;

public class Client {
    public static void main(String[] args){
        Receiver receiver = new Receiver();

        Disparar disparar = new Disparar(receiver);
        Defensa defensa = new Defensa(receiver);
        Atacar atacar = new Atacar(receiver);

        Invoker invoker = new Invoker();

        invoker.addCommand(atacar);
        invoker.addCommand(defensa);
        invoker.addCommand(disparar);
        invoker.addCommand(defensa);
        invoker.addCommand(atacar);

        invoker.runCommands();
    }
}

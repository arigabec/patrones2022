package interpreter.example;

public class Client {
    public static void main(String[] args){
        String msg = "1 + 3 + 4 - 4";
        Interpreter parser = new Interpreter(msg);
        System.out.println("Mensaje interpretado: " + parser.evaluateMsg());
    }
}

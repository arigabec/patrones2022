package interpreter.example;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends OperacionM {
    private List<OperacionM> grammar =new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpret) {
        context = new Context(msgToInterpret.replace(" ", ""));
        for (String charOriginal : msgToInterpret.split(" ")) {
            switch (charOriginal){
                case "+":
                    grammar.add(new Suma(charOriginal.length()));
                    break;
                case "-":
                    grammar.add(new Resta(charOriginal.length()));
                    break;
                default:
                    grammar.add(new Numero(charOriginal.length()));
                    break;
            }
        }
    }

    public int evaluateMsg(){
        for (OperacionM expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}

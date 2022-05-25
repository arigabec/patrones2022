package exercises.exercise5;

public class Terminal3 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 3, lo reemplazamos por III (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output = context.output + "III";
            context.input = context.input.substring(1);
        }
    }
}

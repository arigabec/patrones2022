package exercises.exercise5;

public class Terminal8 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 8, lo reemplazamos por VIII (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("8")){
            context.output = context.output + "VIII";
            context.input = context.input.substring(1);
        }
    }
}

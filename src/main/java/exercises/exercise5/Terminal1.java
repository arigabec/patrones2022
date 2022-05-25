package exercises.exercise5;

public class Terminal1 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 1, lo reemplazamos por I (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")){
            context.input = context.input.substring(1);
            if (context.input.startsWith("0")){
                context.output = context.output + "X";
                context.input = context.input.substring(1);
            } else {
                context.output = context.output + "I";
            }
        }
    }
}

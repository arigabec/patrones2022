package exercises.exercise5;

public class Terminal2 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 2, lo reemplazamos por II (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("2")){
            context.output = context.output + "II";
            context.input = context.input.substring(1);
        }
    }
}

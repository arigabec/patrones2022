package exercises.exercise5;

public class Terminal5 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 5, lo reemplazamos por V (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("5")){
            context.output = context.output + "V";
            context.input = context.input.substring(1);
        }
    }
}

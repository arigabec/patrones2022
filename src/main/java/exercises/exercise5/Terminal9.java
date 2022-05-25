package exercises.exercise5;

public class Terminal9 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 9, lo reemplazamos por IX (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("9")){
            context.output = context.output + "IX";
            context.input = context.input.substring(1);
        }
    }
}

package exercises.exercise5;

public class Terminal0 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos un 0, lo mantenemos (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("0")){
            context.output = context.output + "0";
            context.input = context.input.substring(1);
        }
    }
}

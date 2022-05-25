package exercises.exercise5;

public class TerminalEspacio extends AbstractExpression {
    /* Si en el mensaje (input) encontramos un espacio, lo mantenemos (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.output = context.output + " ";
            context.input = context.input.substring(1);
        }
    }
}

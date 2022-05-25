package exercises.exercise5;

public class Terminal7 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 7, lo reemplazamos por VII (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("7")){
            context.output = context.output + "VII";
            context.input = context.input.substring(1);
        }
    }
}

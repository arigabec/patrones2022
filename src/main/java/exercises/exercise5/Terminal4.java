package exercises.exercise5;

public class Terminal4 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 4, lo reemplazamos por IV (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("4")){
            context.output = context.output + "IV";
            context.input = context.input.substring(1);
        }
    }
}

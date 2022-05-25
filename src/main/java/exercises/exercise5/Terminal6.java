package exercises.exercise5;

public class Terminal6 extends AbstractExpression {
    /* Si en el mensaje (input) encontramos el número 6, lo reemplazamos por VI (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("6")){
            context.output = context.output + "VI";
            context.input = context.input.substring(1);
        }
    }
}

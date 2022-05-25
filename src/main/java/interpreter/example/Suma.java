package interpreter.example;

public class Suma extends OperacionM {

    public Suma(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")){
            context.signo = 1;
            context.input = context.input.substring(this.digit);
        }
    }

}

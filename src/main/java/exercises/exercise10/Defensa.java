package exercises.exercise10;

public class Defensa implements ICommand {
    private Receiver receiver;

    public Defensa(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.defensa();
    }
}

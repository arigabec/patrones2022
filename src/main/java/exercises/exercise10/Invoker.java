package exercises.exercise10;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> commands = new ArrayList<>();

    public Invoker(){
        System.out.println("INICIANDO EL JUEGO");
    }

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void runCommands(){
        for (ICommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}

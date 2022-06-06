package command.example;

import java.util.ArrayList;
import java.util.List;

public class MakeBuild {
    private List<ICommand> commandsIDE = new ArrayList<>();

    public MakeBuild(){}

    public void addCommand(ICommand command){
        commandsIDE.add(command);
    }

    public void makeBuildCmd(){
        for (ICommand command : commandsIDE) {
            command.execute();
        }
        commandsIDE.clear();
    }
}

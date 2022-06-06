package command.example;

public class CleanBuild implements ICommand {
    private IDE ide;

    public CleanBuild(IDE ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        ide.cleanBuild();
    }
}

package command.example;

public class GenerateBuild implements ICommand {
    private IDE ide;

    public GenerateBuild(IDE ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        ide.generateBuild();
    }
}

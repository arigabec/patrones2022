package command.example;

public class CompileStandarization implements ICommand {
    private IDE ide;

    public CompileStandarization(IDE ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        ide.compileStandarization();
    }
}

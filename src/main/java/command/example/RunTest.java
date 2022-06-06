package command.example;

public class RunTest implements ICommand {
    private IDE ide;

    public RunTest(IDE ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        ide.runUnitTest();
    }
}

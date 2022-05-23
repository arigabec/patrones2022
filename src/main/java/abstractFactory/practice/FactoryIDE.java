package abstractFactory.practice;

public class FactoryIDE {
    public static Ide make(String type){
        Ide ide;
        switch (type){
            case "eclipse":
                ide = new Eclipse();
                break;
            case "idea":
                ide = new Intellij();
                break;
            case "vscode":
                ide = new VSCode();
                break;
            default:
                ide = new VisualStudio();
                break;
        }
        return ide;
    }
}

package decorator.example;

public class PluginIDE implements IDE {
    protected IDE ide;
    protected int costPlugin;
    protected boolean isOpenSource;

    public PluginIDE(IDE ide, int costPlugin, boolean isOpenSource) {
        this.ide = ide;
        this.costPlugin = costPlugin;
        this.isOpenSource = isOpenSource;
    }

    @Override
    public void showInformation() {
        ide.showInformation();
    }

    @Override
    public void setCost(int cost) {

    }

    @Override
    public int getCost() {
        return 0;
    }

    public int getCostPlugin() {
        return costPlugin;
    }

    public void setCostPlugin(int costPlugin) {
        this.costPlugin = costPlugin;
    }
}

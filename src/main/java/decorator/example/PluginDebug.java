package decorator.example;

public class PluginDebug extends PluginIDE {

    public PluginDebug(IDE ide, int costPlugin, boolean isOpenSource) {
        super(ide, costPlugin, isOpenSource);
    }

    @Override
    public void showInformation(){
        int newCost = costPlugin + ide.getCost();
        ide.setCost(newCost);
        super.showInformation();
        infoPlugin();
    }

    public void infoPlugin(){
        System.out.println(">>> PluginDebug");
        System.out.println("open source: " + isOpenSource);
        System.out.println("cost plugin: " + costPlugin);
    }

    @Override
    public void setCost(int cost) {
        this.costPlugin = cost;
    }

    @Override
    public int getCost() {
        return this.costPlugin;
    }
}

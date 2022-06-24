package decorator.example;

public class PluginDeploy extends PluginIDE {

    public PluginDeploy(IDE ide, int costPlugin, boolean isOpenSource) {
        super(ide, costPlugin, isOpenSource);
    }

    @Override
    public void showInformation(){
        int newCost = costPlugin + ide.getCost();
        ide.setCost(newCost);
        super.showInformation();
        infoPlugin();
    }

    @Override
    public void setCost(int cost) {
        this.costPlugin = cost;
    }

    @Override
    public int getCost() {
        return this.costPlugin;
    }

    public void infoPlugin(){
        System.out.println(">>> PluginDeploy");
        System.out.println("Open source: " + isOpenSource);
        System.out.println("Cost plugin: " + costPlugin);
    }
}

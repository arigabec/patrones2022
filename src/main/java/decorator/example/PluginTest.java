package decorator.example;

public class PluginTest extends PluginIDE {

    public PluginTest(IDE ide, int costPlugin, boolean isOpenSource) {
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
        System.out.println(">>> PluginTest");
        System.out.println("Open source: " + isOpenSource);
        System.out.println("Cost plugin: " + costPlugin);
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

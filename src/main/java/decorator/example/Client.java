package decorator.example;

public class Client {
    public static void main (String []args){

        IDE intelliJIDEA = new IntellijIdea("community","300mb","2022",10);

        intelliJIDEA= new PluginTest(intelliJIDEA,15,false);
        intelliJIDEA= new PluginDebug(intelliJIDEA,0,true);

        intelliJIDEA.showInformation();

        IDE eclipse = new Eclipse("premium","100mb","2022",100);

        eclipse= new PluginDeploy(eclipse,50,false);
        eclipse= new PluginDebug(eclipse, 150, false);
        eclipse= new PluginTest(eclipse, 250, false);

        eclipse.showInformation();
    }
}

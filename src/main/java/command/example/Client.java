package command.example;

public class Client {
    public static void main(String[] args){
        IDE intelliJ = new IDE("IntelliJ Idea", "2021", "Community Version");

        GenerateBuild generateBuild = new GenerateBuild(intelliJ);
        CompileStandarization compileStandarization = new CompileStandarization(intelliJ);
        CleanBuild cleanBuild = new CleanBuild(intelliJ);
        RunTest runTest = new RunTest(intelliJ);

        MakeBuild makeBuild = new MakeBuild();
        makeBuild.addCommand(cleanBuild);
        makeBuild.addCommand(runTest);
        makeBuild.addCommand(compileStandarization);
        makeBuild.addCommand(generateBuild);

        makeBuild.makeBuildCmd();
    }
}

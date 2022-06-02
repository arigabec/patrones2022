package memento.example;

public class Client {
    public static void main(String[] args){
        Github github = new Github();
        Git git = new Git();
        Codigo codigo;

        codigo = new Codigo("public class ...","Inicio de codigo", false);
        codigo.setLineasCodigo("public interface ...");
        codigo.setStoryComplete(true);
        git.setCommit(codigo);
        github.createCommit("1234abc", git.createCommit());
        codigo = new Codigo("Class Person","add persona", false);
        codigo = new Codigo("Class Estudiante","add estudiante", true);
        git.setCommit(codigo);
        github.createCommit("4567def", git.createCommit());
        codigo = new Codigo("Class Docente","add docente", false);
        codigo = new Codigo("Class Product","add producto", false);

        // codigo = git.restoreCommit(github.getCommit("1234abc"));
        codigo = git.restoreCommit(github.getCommit("4567def"));
        codigo.showInfo();
    }
}

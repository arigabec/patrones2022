package memento.example;

public class Codigo {
    private String lineasCodigo;
    private String comments;
    private boolean isStoryComplete;

    public Codigo(String lineasCodigo, String comments, boolean isStoryComplete) {
        this.lineasCodigo = lineasCodigo;
        this.comments = comments;
        this.isStoryComplete = isStoryComplete;
    }

    public String getLineasCodigo() {
        return lineasCodigo;
    }

    public void setLineasCodigo(String lineasCodigo) {
        this.lineasCodigo = lineasCodigo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isStoryComplete() {
        return isStoryComplete;
    }

    public void setStoryComplete(boolean storyComplete) {
        isStoryComplete = storyComplete;
    }

    public void showInfo() {
        System.out.println(lineasCodigo);
    }
}

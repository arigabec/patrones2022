package proxy.example;

public class Client {
    public static void main(String[] args){
        IServer server = new FileServerProxy("10.10.10.10", "95","file server", "90TB");
        server.saveFile(new File("tarea1", "txt"));
        server.saveFile(new File("tarea2", "pdf"));
    }
}

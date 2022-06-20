package proxy.structure;

public class Client {
    public static void main(String[] args){
        ISubject proxy = new Proxy("http://google.com", "Buscar UPB");
        proxy.request();
    }
}

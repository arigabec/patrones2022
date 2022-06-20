package proxy.structure;

public class Proxy implements  ISubject {
    private RealSubject realSubject;
    private String attr1;
    private String attr2;

    public Proxy(String attr1, String attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        realSubject = new RealSubject(this.attr1, this.attr2);
    }

    @Override
    public void request() {
        // Conditions
        // Filters
        // Verifications
        if(attr1.contains("https")){
            realSubject.request();
        } else {
            System.out.println("ERROR! El llamado es de tipo https");
        }
    }
}

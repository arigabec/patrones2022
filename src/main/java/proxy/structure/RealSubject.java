package proxy.structure;

public class RealSubject implements  ISubject {
    String attr1;
    String attr2;

    public RealSubject(String attr1, String attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }

    public void request(){
        System.out.println("RealSubject working ...");
    }
}

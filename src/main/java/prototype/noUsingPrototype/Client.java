package prototype.noUsingPrototype;

public class Client {

    public static  void main(String [] args){
        Persona jose = new Persona();
        jose.setAttribute1("jose attr1 ZONA");
        jose.setAttribute2("jose attr2 TS");
        jose.setAttribute3("jose attr3 U");
        jose.setAttribute4("jose attr4");
        jose.setAttribute5(5);
        System.out.println("JOSE > " + jose.getAttribute1());
        System.out.println("JOSE > " + jose.getAttribute2());
        System.out.println("JOSE > " + jose.getAttribute3());
        System.out.println("JOSE > " + jose.getAttribute4());
        System.out.println("JOSE > " + jose.getAttribute5());

        Persona juan = new Persona();
        juan=jose;
        System.out.println("JUAN > " + juan.getAttribute1());
        System.out.println("JUAN > " + juan.getAttribute2());
        System.out.println("JUAN > " + juan.getAttribute3());
        System.out.println("JUAN > " + juan.getAttribute4());
        System.out.println("JUAN > " + juan.getAttribute5());

        // Ambos toman el mismo valor 6!
        juan.setAttribute5(6);
        System.out.println("JUAN > " + juan.getAttribute5());
        System.out.println("JOSE > " + jose.getAttribute5());
    }
}

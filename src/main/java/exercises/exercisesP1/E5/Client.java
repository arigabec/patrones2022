package exercises.exercisesP1.E5;

public class Client {
    public static void main(String[] args){
        Cocinero cocinero = new Cocinero();
        Tira t = new Tira();
        Bife b = new Bife();
        Lomito l = new Lomito();

        cocinero.setBuilder(t);
        cocinero.buildProduct();
        Carne pedido1 = cocinero.getProductBuilder();
        pedido1.showInfo();

        cocinero.setBuilder(b);
        cocinero.buildProduct();
        Carne pedido2 = cocinero.getProductBuilder();
        pedido2.showInfo();

        cocinero.setBuilder(l);
        cocinero.buildProduct();
        Carne pedido3 = cocinero.getProductBuilder();
        pedido3.showInfo();
    }
}

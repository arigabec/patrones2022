package exercises.exercise15;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        IEmpresa1 celular = new Celular(1200, 4);
        celular.showPrecio();
        celular.showTiempo();

        IEmpresa1 tablet = new Tablet(1500, 6);
        tablet.showPrecio();
        tablet.showTiempo();

        IEmpresa1 computadora = new Computadora(2500, 7);
        computadora.showPrecio();
        computadora.showTiempo();

        IEmpresa1 televisor = new Artefacto(new Televisor(3000, 4));
        televisor.showPrecio();
        televisor.showTiempo();

        IEmpresa1 lavadora = new Artefacto(new Lavadora(4100, 5));
        lavadora.showPrecio();
        lavadora.showTiempo();

        IEmpresa1 refrigerador = new Artefacto(new Refrigerador(4500, 5));
        refrigerador.showPrecio();
        refrigerador.showTiempo();
    }
}

package exercises.exercise13;

public class Client {
    public static void main(String[] args){
        Tienda tiendaDeRopa = new Tienda("La tiendita de Ropa");
        tiendaDeRopa.addRopa(new Ropa("Polera", "Blanco", 60));
        tiendaDeRopa.addRopa(new Ropa("Pantalon", "Azul marino", 170));
        tiendaDeRopa.addRopa(new Ropa("Sudadera", "Lila", 180));
        tiendaDeRopa.addRopa(new Ropa("Chalina", "Multicolor", 45));
        tiendaDeRopa.addRopa(new Ropa("Tenis deportivos", "Blanco", 210));

        // tiendaDeRopa.setEstacion(new Invierno());
        tiendaDeRopa.setEstacion(new Otono());
        // tiendaDeRopa.setEstacion(new Primavera());
        // tiendaDeRopa.setEstacion(new Verano());

        tiendaDeRopa.iniciarEstacion();
    }
}

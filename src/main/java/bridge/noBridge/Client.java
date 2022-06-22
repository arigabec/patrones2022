package bridge.noBridge;

public class Client {
    public static void main(String[] args){
        Circulo circulo = new Circulo();
        circulo.pintarRojo();
        circulo.pintarAzul();
        circulo.pintarVerde();

        Triangulo triangulo = new Triangulo();
        triangulo.pintarAzul();

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.pintarVerde();

        // Si queremos aumentar un metodo en la interfaz, debemos aplicar el metodo en todas las clases que la
        // implementan! Lo cual es un problema
    }
}

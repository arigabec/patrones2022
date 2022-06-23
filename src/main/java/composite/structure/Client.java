package composite.structure;

public class Client {
    public static void main(String[] args){
        Leaf celular1 = new Leaf("Celular1");
        Leaf celular2 = new Leaf("Celular2");
        Leaf celular3 = new Leaf("Celular3");
        Leaf celular4 = new Leaf("Celular4");

        Composite cajaCelular = new Composite("Caja1");
        cajaCelular.add(celular1);
        cajaCelular.add(celular2);
        cajaCelular.add(celular3);
        cajaCelular.add(celular4);

        Composite cajaCelular2 = new Composite("Caja2");
        cajaCelular2.add(new Leaf("Celular5"));
        cajaCelular2.add(new Leaf("Celular6"));

        Composite contenedorCelular = new Composite("Contenedor1");
        contenedorCelular.add(cajaCelular);
        contenedorCelular.add(cajaCelular2);

        Composite contenedorCelular2 = new Composite("Contenedor2");
        contenedorCelular2.add(cajaCelular);
        contenedorCelular2.add(cajaCelular2);

        Composite cargaBarco = new Composite("CargaBarco");
        cargaBarco.add(contenedorCelular);
        cargaBarco.add(contenedorCelular2);

        cargaBarco.operation();
    }
}

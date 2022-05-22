package factoryMethod.example.heladeria;

public class CreatorHeladoAgua extends Creator {

    @Override
    public HeladoAgua createProduct() {
        Fruta cereza = new Fruta();
        cereza.setCosto("4");
        cereza.setNombre("Cereza");
        cereza.setSize("S");
        cereza.setTipo("Dulce");

        Base galleta = new Base();
        galleta.setCosto("5");
        galleta.setNombre("Cracker");
        galleta.setSize("S");
        galleta.setTipo("Galleta de agua");

        HeladoAgua helado = new HeladoAgua(cereza, galleta);
        helado.setSize("S");
        helado.setShape("Circular");

        return helado;
    }
}

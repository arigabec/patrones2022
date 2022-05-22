package factoryMethod.example.heladeria;

public class CreatorHeladoMixto extends Creator {

    @Override
    public HeladoMixto createProduct() {
        Fruta cereza = new Fruta();
        cereza.setCosto("5");
        cereza.setNombre("Cereza");
        cereza.setSize("S");
        cereza.setTipo("Dulce");

        Base galleta = new Base();
        galleta.setCosto("6");
        galleta.setNombre("Cracker");
        galleta.setSize("S");
        galleta.setTipo("Galleta de agua");

        Crema crema = new Crema();
        crema.setCosto("9");
        crema.setMarca("Delizia");
        crema.setSabor("Vainilla");

        HeladoMixto helado = new HeladoMixto(cereza, galleta, crema);
        helado.setCosto("25");
        helado.setSize("S");
        helado.setShape("Circular");

        return helado;
    }
}

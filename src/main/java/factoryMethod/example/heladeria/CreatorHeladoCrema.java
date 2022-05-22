package factoryMethod.example.heladeria;

public class CreatorHeladoCrema extends Creator {

    @Override
    public HeladoCrema createProduct() {
        Fruta cereza = new Fruta();
        cereza.setCosto("7");
        cereza.setNombre("Cereza");
        cereza.setSize("S");
        cereza.setTipo("Dulce");

        Base galleta = new Base();
        galleta.setCosto("8");
        galleta.setNombre("Cracker");
        galleta.setSize("S");
        galleta.setTipo("Galleta de agua");

        Crema crema = new Crema();
        crema.setCosto("10");
        crema.setMarca("Delizia");
        crema.setSabor("Vainilla");

        HeladoCrema helado = new HeladoCrema(cereza, galleta, crema);
        helado.setSize("S");
        helado.setShape("Circular");

        return helado;
    }
}

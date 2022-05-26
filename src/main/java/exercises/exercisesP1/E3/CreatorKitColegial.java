package exercises.exercisesP1.E3;

public class CreatorKitColegial extends Creator {
    @Override
    public KitColegial createKit() {
        Mochila mochila = new Mochila();
        mochila.setSize("Grande");
        mochila.setNroBolsillos(7);

        Libro libro = new Libro();
        libro.setGenero("Matemáticas");
        libro.setAutor("Victor Chungara");

        Computadora computadora = new Computadora();
        computadora.setMarca("HP");
        computadora.setOs("Windows 10");

        KitColegial kit2 = new KitColegial(mochila, libro, computadora);

        return kit2;
    }
}

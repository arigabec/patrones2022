package exercises.exercisesP1.E3;

public class KitColegial implements IProduct {
    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    public KitColegial(Mochila mochila, Libro libro, Computadora computadora) {
        this.mochila = mochila;
        this.libro = libro;
        this.computadora = computadora;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("KIT COLEGIAL");
        System.out.println("MOCHILA: ");
        System.out.println("Tamaño: " + mochila.getSize());
        System.out.println("Nro de bolsillos: " + mochila.getNroBolsillos());
        System.out.println("LIBRO: ");
        System.out.println("Género: " + libro.getGenero());
        System.out.println("Auto: " + libro.getAutor());
        System.out.println("COMPUTADORA: ");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Sistema operativo: " + computadora.getOs());
        System.out.println();
    }
}

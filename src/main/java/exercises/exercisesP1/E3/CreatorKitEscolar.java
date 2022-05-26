package exercises.exercisesP1.E3;

public class CreatorKitEscolar extends Creator {
    @Override
    public KitEscolar createKit() {
        Mochila mochila = new Mochila();
        mochila.setSize("Mediana");
        mochila.setNroBolsillos(5);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("Azul marino");
        deportivo.setTalla("S");
        deportivo.setNroDePrendas(4);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Carta");
        cuaderno.setNroDeHojas(100);

        KitEscolar kit1 = new KitEscolar(mochila, deportivo, cuaderno);

        return kit1;
    }
}

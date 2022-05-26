package exercises.exercisesP1.E3;

public class KitEscolar implements IProduct {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuaderno cuaderno) {
        this.mochila = mochila;
        this.deportivo = deportivo;
        this.cuaderno = cuaderno;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void showInfo() {
        System.out.println("KIT ESCOLAR");
        System.out.println("MOCHILA: ");
        System.out.println("Tamaño: " + mochila.getSize());
        System.out.println("Nro de bolsillos: " + mochila.getNroBolsillos());
        System.out.println("DEPORTIVO: ");
        System.out.println("Color: " + deportivo.getColor());
        System.out.println("Talla: " + deportivo.getTalla());
        System.out.println("Nro de prendas: " + deportivo.getNroDePrendas());
        System.out.println("CUADERNO: ");
        System.out.println("Tipo: " + cuaderno.getTipo());
        System.out.println("Nro de hojas: " + cuaderno.getNroDeHojas());
        System.out.println();
    }
}

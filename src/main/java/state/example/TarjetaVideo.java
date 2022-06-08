package state.example;

public class TarjetaVideo {
    private String capacidadTotal;
    private int capacidadUtilizada;
    private String descripcion;

    public TarjetaVideo(){}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public TarjetaVideo setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public int getCapacidadUtilizada() {
        return capacidadUtilizada;
    }

    public TarjetaVideo setCapacidadUtilizada(int capacidadUtilizada) {
        this.capacidadUtilizada = capacidadUtilizada;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TarjetaVideo setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public void showInfo(){
        System.out.println("INFORMACION TARJETA DE VIDEO");
        System.out.println("Capacidad Total: " + capacidadTotal);
        System.out.println("Capacidad Utilizada: " + capacidadUtilizada);
        System.out.println("Descripcion: " + descripcion);
    }
}

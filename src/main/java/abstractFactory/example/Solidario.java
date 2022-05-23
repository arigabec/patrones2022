package abstractFactory.example;

public class Solidario implements IPasaje {
    private int nroVuelo;
    private int nroAsiento;
    private int costo;
    private int descuento;
    private Pasajero pasajero = new Pasajero();

    public Solidario(){}

    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public void showInfo() {
        System.out.println("INFORMACIÓN DEL PASAJE");
        System.out.println("Tipo: Solidario");
        System.out.println("Nombre del pasajero: " + pasajero.getNombre());
        System.out.println("Número de carnet: " + pasajero.getCi());
        System.out.println("Número de vuelo: " + nroVuelo);
        System.out.println("Número de asiento: " + nroAsiento);
        System.out.println("Costo: " + costo);
        System.out.println("Descuento: " + descuento);
        System.out.println();
    }
}

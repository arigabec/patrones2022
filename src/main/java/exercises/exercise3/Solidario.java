package exercises.exercise3;

public class Solidario implements IPasaje {
    private int nroVuelo;
    private int nroAsiento;
    private int costo;
    private int descuento;
    private String motivoDescuento;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;

    public Solidario(Destino destino, Origen origen, Avion avion, Pasajero pasajero) {
        this.destino = destino;
        this.origen = origen;
        this.avion = avion;
        this.pasajero = pasajero;
    }

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

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
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
        System.out.println("Origen: " + origen.getAeropuerto() + ", " + origen.getCiudad());
        System.out.println("Destino: " + destino.getAeropuerto() + ", " + destino.getCiudad());
        System.out.println("Costo: " + costo);
        System.out.println("Descuento: " + descuento);
        System.out.println("Motivo del descuento: " + motivoDescuento);
        System.out.println();
    }
}

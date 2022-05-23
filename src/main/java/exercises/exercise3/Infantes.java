package exercises.exercise3;

public class Infantes implements IPasaje {
    private int nroVuelo;
    private int nroAsiento;
    private int costoEspecial;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;

    public Infantes(Destino destino, Origen origen, Avion avion, Pasajero pasajero) {
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

    public int getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(int costoEspecial) {
        this.costoEspecial = costoEspecial;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
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

    @Override
    public void showInfo() {
        System.out.println("INFORMACIÓN DEL PASAJE");
        System.out.println("Tipo: Infante");
        System.out.println("Nombre del pasajero: " + pasajero.getNombre());
        System.out.println("Número de carnet: " + pasajero.getCi());
        System.out.println("Fecha de nacimiento: " + pasajero.getFechaNacimiento());
        System.out.println("Número de vuelo: " + nroVuelo);
        System.out.println("Número de asiento: " + nroAsiento);
        System.out.println("Origen: " + origen.getAeropuerto() + ", " + origen.getCiudad());
        System.out.println("Destino: " + destino.getAeropuerto() + ", " + destino.getCiudad());
        System.out.println("Costo: " + costoEspecial);
        System.out.println();
    }
}

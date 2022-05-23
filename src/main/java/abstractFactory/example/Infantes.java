package abstractFactory.example;

public class Infantes implements IPasaje {
    private int nroVuelo;
    private int nroAsiento;
    private int costoEspecial;
    private Pasajero pasajero = new Pasajero();

    public Infantes(){}

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

    @Override
    public void showInfo() {
        System.out.println("INFORMACIÓN DEL PASAJE");
        System.out.println("Tipo: Infante");
        System.out.println("Nombre del pasajero: " + pasajero.getNombre());
        System.out.println("Número de carnet: " + pasajero.getCi());
        System.out.println("Fecha de nacimiento: " + pasajero.getFechaNacimiento());
        System.out.println("Número de vuelo: " + nroVuelo);
        System.out.println("Número de asiento: " + nroAsiento);
        System.out.println("Costo: " + costoEspecial);
        System.out.println();
    }
}

package exercises.exercise3;

public class CreatorSolidario extends Creator {

    @Override
    public Solidario createProduct(Pasajero pasajero, int asiento) {
        Destino destino = new Destino();
        destino.setAeropuerto("Viru Viru");
        destino.setCiudad("Santa Cruz");
        destino.setPais("Bolivia");

        Origen origen = new Origen();
        origen.setAeropuerto("El Alto");
        origen.setCiudad("La Paz");
        origen.setPais("Bolivia");

        Avion avion = new Avion();
        avion.setMarca("Boliviana de Aviación");
        avion.setCapacidad(100);
        avion.setModelo("Boeing 700");
        avion.setNroAsientos(100);

        Solidario pasajeSolidario = new Solidario(destino, origen, avion, pasajero);
        pasajeSolidario.setCosto(752);
        pasajeSolidario.setNroAsiento(asiento);
        pasajeSolidario.setNroVuelo(584);
        pasajeSolidario.setDescuento(100);
        pasajeSolidario.setMotivoDescuento("Tercera edad");

        return pasajeSolidario;
    }
}

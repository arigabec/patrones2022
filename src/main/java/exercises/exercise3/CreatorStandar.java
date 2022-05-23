package exercises.exercise3;

public class CreatorStandar extends Creator {

    @Override
    public Standar createProduct(Pasajero pasajero, int asiento) {
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

        Standar pasajeStandar = new Standar(destino, origen, avion, pasajero);
        pasajeStandar.setCosto(752);
        pasajeStandar.setNroAsiento(asiento);
        pasajeStandar.setNroVuelo(584);

        return pasajeStandar;
    }
}

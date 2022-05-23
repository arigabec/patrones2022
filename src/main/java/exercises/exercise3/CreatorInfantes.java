package exercises.exercise3;

public class CreatorInfantes extends Creator {

    @Override
    public Infantes createProduct(Pasajero pasajero, int asiento) {
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

        Infantes pasajeInfantes = new Infantes(destino, origen, avion, pasajero);
        pasajeInfantes.setCostoEspecial(552);
        pasajeInfantes.setNroAsiento(asiento);
        pasajeInfantes.setNroVuelo(584);

        return pasajeInfantes;
    }
}

package exercises.exercise13;

import java.util.List;

public class Primavera implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("<<< PRECIOS POR TEMPORADA DE PRIMAVERA >>>");
        for (Ropa ropa : tienda) {
            ropa.setPrecioTemporada(ropa.getPrecioOriginal());
            ropa.showInfo();
        }
    }
}

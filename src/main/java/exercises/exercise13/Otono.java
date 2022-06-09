package exercises.exercise13;

import java.util.List;

public class Otono implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("<<< PRECIOS POR TEMPORADA DE OTOÑO >>>");
        for (Ropa ropa : tienda) {
            int monto = ropa.getPrecioOriginal()*50/100;
            ropa.setPrecioTemporada(ropa.getPrecioOriginal() - monto);
            ropa.showInfo();
        }
    }
}

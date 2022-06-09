package exercises.exercise13;

import java.util.List;

public class Verano implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("<<< PRECIOS POR TEMPORADA DE VERANO >>>");
        for (Ropa ropa : tienda) {
            int monto = ropa.getPrecioOriginal()*10/100;
            ropa.setPrecioTemporada(ropa.getPrecioOriginal() - monto);
            ropa.showInfo();
        }
    }
}

package exercises.exercise13;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String name;
    private List<Ropa> listaDeRopa = new ArrayList<>();
    private IEstacion estacion;

    public Tienda(String name) {
        this.name = name;
    }

    public void addRopa(Ropa ropa){
        listaDeRopa.add(ropa);
    }

    public void setEstacion(IEstacion estacion) {
        this.estacion = estacion;
    }

    public void iniciarEstacion(){
        estacion.descuento(listaDeRopa);
    }
}

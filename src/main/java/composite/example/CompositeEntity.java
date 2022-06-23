package composite.example;

import java.util.ArrayList;
import java.util.List;

public class CompositeEntity extends Component {
    private List<Component> componentList = new ArrayList<>();

    public CompositeEntity(String tipo){
        super(tipo);
    }

    @Override
    public void mostrarDetalles() {
        int tiempoTotal = 0;
        for (Component c : componentList) {
            tiempoTotal = tiempoTotal+c.getTiempo();
        }
        this.setTiempo(tiempoTotal);
        this.showInfo();
        System.out.println("TIEMPO TOTAL DE ESTIMACION > " + tiempoTotal);
        for (Component c : componentList) {
            c.mostrarDetalles();
        }
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}

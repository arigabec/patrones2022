package composite.example;

public class Entity extends Component {

    public Entity(String type){
        super(type);
    }

    @Override
    public void mostrarDetalles() {
        this.showInfo();
    }

    @Override
    public void add(Component component) {
        //TODO
    }

    @Override
    public void remove(Component component) {
        //TODO
    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}

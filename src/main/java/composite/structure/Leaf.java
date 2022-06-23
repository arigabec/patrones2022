package composite.structure;

public class Leaf extends Component {
    public Leaf(String attr1){
        super(attr1);
    }

    @Override
    public void operation() {
        System.out.println("Leaf > operation1 > " + getAttr1());
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

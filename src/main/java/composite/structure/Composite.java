package composite.structure;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> compositeList = new ArrayList<>();

    public Composite(String attr1){
        super(attr1);
    }

    @Override
    public void operation() {
        System.out.println("Composite > operation1 > " + getAttr1());
        for (Component c:compositeList) {
            c.operation();
        }
    }

    @Override
    public void add(Component component) {
        compositeList.add(component);
    }

    @Override
    public void remove(Component component) {
        compositeList.remove(component);
    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}

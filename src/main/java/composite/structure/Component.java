package composite.structure;

public abstract class Component {
    private String attr1;
    private String attr2;

    public Component(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int position);
}

package adapter.structure;

public class Adaptee {
    private String attr1;
    private String attr2;
    private String attr3;

    public Adaptee(){}

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

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public void method1Action1(){
        System.out.println("Adaptee > method1");
    }

    public void method2Action2(String value1, String value2){
        System.out.println("Adaptee > method2 > " + value1 + ", " + value2);
    }
}

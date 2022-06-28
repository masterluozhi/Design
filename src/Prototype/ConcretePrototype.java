package Prototype;

public class ConcretePrototype extends Prototype{
    private  String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public Prototype clone() {
        return null;
    }
}

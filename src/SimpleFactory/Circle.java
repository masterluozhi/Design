package SimpleFactory;

public class Circle extends  Shape{
    @Override
    public void draw() {
        System.out.println("创建了圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除了圆型");
    }
}

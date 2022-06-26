package SimpleFactory;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("创建了三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除了三角形");
    }
}

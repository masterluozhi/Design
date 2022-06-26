package SimpleFactory;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("创建了正方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除了正方型");
    }
}

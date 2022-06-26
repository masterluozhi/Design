package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        SimpleFactory.ShapeFactory.createShape(XMLUtill.getShapeType()).draw();
    }
}

import model.Factory;
import model.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle=Factory.getShape(Factory.ShapeType.CIRCLE);
        Shape square=Factory.getShape(Factory.ShapeType.SQUARE);
        Shape rectangle=Factory.getShape(Factory.ShapeType.RECTANGLE);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}

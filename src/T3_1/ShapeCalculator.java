package T3_1;

public class ShapeCalculator {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5, "Violet"),
                new Rectangle(4,6, "Purple"),
                new Triangle(3,8, "Hot pink")
        };
        System.out.println("Shape calculator");
        System.out.println();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

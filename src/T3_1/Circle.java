package T3_1;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Area of circle with radius " + radius + " and colour " + getColour() +
                ": " + calculateArea();
    }
}

package T3_1;

public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(double base, double height, String colour) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Area of Triangle with base " + base + " and height " + height +
                " and colour " + getColour() + ": " + calculateArea();
    }
}
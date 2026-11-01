package T3_1;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height, String colour) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public String toString() {
        return "Area of rectangle with width " + width + " and height " + height +
                " and colour " + getColour() + ": " + calculateArea();
    }
}

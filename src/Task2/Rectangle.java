package Task2;

public class Rectangle extends Shape {
    private double a;
    private double b;

    protected Rectangle(String colour, double a, double b) {
        super(colour);
        this.a = a;
        this.b = b;
    }

    @Override
    protected double getCircumference() {
        return 2 * a + 2 * b;
    }

    @Override
    protected double getArea() {
        return a * b;
    }
}

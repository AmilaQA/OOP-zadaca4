package Task2;

public class Circle extends Shape {
    private double radius;

    protected Circle(double radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    protected double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override

    protected double getArea() {
        return radius * radius * Math.PI;
    }

    protected void doubleCircle() {
        this.radius = 2 * this.radius;
    }

}

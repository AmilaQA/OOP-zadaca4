package Task2;

public class Square extends Shape {
    private double side;

    protected Square(double side, String colour) {
        super(colour);
        this.side = side;
    }

    protected double getCircumference() {
        return 4 * side;
    }

    protected double getArea() {
        return side * side;
    }
}




package Task2;

public abstract class Shape {
    private String colour;


    protected Shape(String colour) {
        this.colour = colour;
    }

    protected abstract double getArea();

    protected abstract double getCircumference();

    @Override
    public String toString() {
        return "Colour: " + "{" + colour + "}" + ", the area: " + "{" + getArea() + "}" + ", the circumference: " + "{" + getCircumference() + "}";
    }
}

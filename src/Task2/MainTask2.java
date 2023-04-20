package Task2;

import Task1.Flight;

import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(2, "green"));
        shapeList.add(new Square(3, "red"));
        shapeList.add(new Rectangle("yellow", 4, 2));

        shapeList.forEach(x -> System.out.println(x.toString()));
    }
}




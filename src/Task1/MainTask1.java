package Task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTask1 {
    public static void main(String[] args) {

        Plane plane = new Plane();
        Submarine submarine = new Submarine();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Pegasus pegasus = new Pegasus();

        List<Flight> flyingList = new ArrayList<>();
        flyingList.add(plane);
        flyingList.add(duck);
        flyingList.add(pegasus);
        List<Swim> swimmingList = new LinkedList<>();
        swimmingList.add(duck);
        swimmingList.add(fish);
        swimmingList.add(submarine);

        flyingList.forEach(x -> System.out.println(x.fly()));
        swimmingList.forEach(x -> System.out.println(x.swim()));

    }
}
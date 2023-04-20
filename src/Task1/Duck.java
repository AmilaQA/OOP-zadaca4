package Task1;

public class Duck implements Swim, Flight {
    @Override
    public String fly() {
        return "Flies with wings";
    }

    @Override
    public String swim() {
        return "Kinda floats";
    }
}

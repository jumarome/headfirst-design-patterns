package cofee;

public class DarkRoast implements Beverage {

    @Override
    public double cost() {
        return 1.75;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}

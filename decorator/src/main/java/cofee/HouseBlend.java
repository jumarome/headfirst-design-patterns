package cofee;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "House Blend Cofee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

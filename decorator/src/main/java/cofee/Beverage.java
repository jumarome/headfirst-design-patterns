package cofee;

public interface Beverage {
    default String getDescription() {
        return "Unknown Beverage";
    }
    double cost();
}

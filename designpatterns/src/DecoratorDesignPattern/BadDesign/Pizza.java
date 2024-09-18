package DecoratorDesignPattern.BadDesign;

// Base Pizza class
abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

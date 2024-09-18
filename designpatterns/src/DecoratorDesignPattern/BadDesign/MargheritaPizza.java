package DecoratorDesignPattern.BadDesign;

// Concrete Pizza class without toppings
public class MargheritaPizza extends Pizza {
    public MargheritaPizza() {
        description = "Margherita Pizza";
    }

    public double cost() {
        return 6.99;
    }
}

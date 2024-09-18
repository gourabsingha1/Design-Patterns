package DecoratorDesignPattern.BadDesign;

// Concrete Pizza class without toppings
public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        description = "Veggie Pizza";
    }

    public double cost() {
        return 7.99;
    }
}

package DecoratorDesignPattern.BadDesign;

// Concrete Pizza class without toppings
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        description = "Pepperoni Pizza";
    }

    public double cost() {
        return 8.99;
    }
}

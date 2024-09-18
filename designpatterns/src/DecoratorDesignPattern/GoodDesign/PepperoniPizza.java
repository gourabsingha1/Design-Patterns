package DecoratorDesignPattern.GoodDesign;

// Concrete Pizza 3: Pepperoni Pizza
public class PepperoniPizza implements Pizza {
    public String getDescription() {
        return "Pepperoni Pizza";
    }

    public double cost() {
        return 8.99;
    }
}

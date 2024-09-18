package DecoratorDesignPattern.GoodDesign;

// Concrete Pizza 2: Veggie Pizza
public class VeggiePizza implements Pizza {
    public String getDescription() {
        return "Veggie Pizza";
    }

    public double cost() {
        return 7.99;
    }
}

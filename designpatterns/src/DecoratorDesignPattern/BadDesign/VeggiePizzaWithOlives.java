package DecoratorDesignPattern.BadDesign;

// Subclass to account for toppings
public class VeggiePizzaWithOlives extends VeggiePizza {
    public VeggiePizzaWithOlives() {
        description = "Veggie Pizza, Olives";
    }

    public double cost() {
        return super.cost() + 0.50;
    }
}

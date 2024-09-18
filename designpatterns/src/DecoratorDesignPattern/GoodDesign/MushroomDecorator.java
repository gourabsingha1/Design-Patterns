package DecoratorDesignPattern.GoodDesign;

// Concrete Decorators (Toppings: Mushroom)
public class MushroomDecorator extends ToppingDecorator {
    public MushroomDecorator(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mushrooms";
    }

    public double cost() {
        return tempPizza.cost() + 0.75;
    }
}
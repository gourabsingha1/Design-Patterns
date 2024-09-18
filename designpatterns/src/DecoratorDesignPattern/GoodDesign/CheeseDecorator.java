package DecoratorDesignPattern.GoodDesign;

// Concrete Decorators (Toppings: Cheese)
public class CheeseDecorator extends ToppingDecorator {
    public CheeseDecorator(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return tempPizza.cost() + 1.00;
    }
}
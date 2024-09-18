package DecoratorDesignPattern.GoodDesign;

// Concrete Decorators (Toppings: Olive)
public class OliveDecorator extends ToppingDecorator {
    public OliveDecorator(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Olives";
    }

    public double cost() {
        return tempPizza.cost() + 0.50;
    }
}
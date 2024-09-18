package DecoratorDesignPattern.BadDesign;

// Subclass to account for toppings
public class MargheritaPizzaWithCheese extends MargheritaPizza {
    public MargheritaPizzaWithCheese() {
        description = "Margherita Pizza, Cheese";
    }

    public double cost() {
        return super.cost() + 1.00;
    }
}

package DecoratorDesignPattern.BadDesign;

// Subclass to account for toppings
public class PepperoniPizzaWithMushroomsAndCheese extends PepperoniPizza {
    public PepperoniPizzaWithMushroomsAndCheese() {
        description = "Pepperoni Pizza, Mushrooms, Cheese";
    }

    public double cost() {
        return super.cost() + 1.75; // 1.00 for cheese, 0.75 for mushrooms
    }
}
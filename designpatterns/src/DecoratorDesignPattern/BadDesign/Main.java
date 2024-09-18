package DecoratorDesignPattern.BadDesign;

public class Main {
    public static void main(String[] args) {
        // Order a Margherita Pizza with Cheese
        Pizza myPizza = new MargheritaPizzaWithCheese();
        System.out.println("Pizza Description: " + myPizza.getDescription());
        System.out.println("Total Cost: $" + myPizza.cost());

        // Order a Pepperoni Pizza with Mushrooms and Cheese
        Pizza anotherPizza = new PepperoniPizzaWithMushroomsAndCheese();
        System.out.println("Pizza Description: " + anotherPizza.getDescription());
        System.out.println("Total Cost: $" + anotherPizza.cost());
    }
}

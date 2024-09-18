package DecoratorDesignPattern.GoodDesign;

public class Main {
    public static void main(String[] args) {
        // Create a Margherita pizza
        Pizza myPizza = new MargheritaPizza();

        // Decorate it with Cheese
        myPizza = new CheeseDecorator(myPizza);

        // Add Olives
        myPizza = new OliveDecorator(myPizza);

        // Add Mushrooms
        myPizza = new MushroomDecorator(myPizza);

        // Final pizza details
        System.out.println("Pizza Description: " + myPizza.getDescription());
        System.out.println("Total Cost: $" + myPizza.cost());
    }
}
package SolidPrinciple.InterfaceSegregationPrinciple.BadDesign;

public class Waiter implements RestaurantEmployee {
    @Override
    public void washDishes() {
        // Not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers");
    }

    @Override
    public void cookFood() {
        // Not my job
    }
}

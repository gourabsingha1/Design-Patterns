package SolidPrinciple.InterfaceSegregationPrinciple.GoodDesign;

public class Waiter implements WaiterInterface {

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers");
    }

    @Override
    public void takeOrders() {
        System.out.println("Taking orders");
    }
}

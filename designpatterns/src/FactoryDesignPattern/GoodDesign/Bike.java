package FactoryDesignPattern.GoodDesign;

// Step 2: Implement different types of Vehicles
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike!");
    }
}
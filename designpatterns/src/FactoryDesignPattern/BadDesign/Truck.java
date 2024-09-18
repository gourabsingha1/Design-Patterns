package FactoryDesignPattern.BadDesign;

// Step 2: Implement different types of Vehicles
public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck!");
    }
}
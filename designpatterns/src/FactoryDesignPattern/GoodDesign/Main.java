package FactoryDesignPattern.GoodDesign;

// Step 4: Client code using the factory
public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("CAR");
        car.drive();  // Output: Driving a car!

        Vehicle bike = VehicleFactory.getVehicle("BIKE");
        bike.drive();  // Output: Riding a bike!

        Vehicle truck = VehicleFactory.getVehicle("TRUCK");
        truck.drive();  // Output: Driving a truck!
    }
}

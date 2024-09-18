package FactoryDesignPattern.BadDesign;

public class Main {
    public static void main(String[] args) {
        // Instead of using new Car(), client is forced to use an unnecessary factory method
        Vehicle car = VehicleFactory.createCar();
        car.drive();  // Output: Driving a car!

        Vehicle bike = VehicleFactory.createBike();
        bike.drive();  // Output: Riding a bike!

        Vehicle truck = VehicleFactory.createTruck();
        truck.drive();  // Output: Driving a truck!
    }
}

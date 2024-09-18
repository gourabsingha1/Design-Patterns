package FactoryDesignPattern.BadDesign;

// Bad Factory: Redundant factory that adds no value
class VehicleFactory {
    public static Car createCar() {
        return new Car();
    }

    public static Bike createBike() {
        return new Bike();
    }

    public static Truck createTruck() {
        return new Truck();
    }
}
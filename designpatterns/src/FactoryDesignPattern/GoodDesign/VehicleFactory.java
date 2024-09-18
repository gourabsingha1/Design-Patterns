package FactoryDesignPattern.GoodDesign;

// Step 3: Create a Factory to generate objects of the required type
public class VehicleFactory {
    // Factory method to create a vehicle
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        return switch (vehicleType.toUpperCase()) {
            case "CAR" -> new Car();
            case "BIKE" -> new Bike();
            case "TRUCK" -> new Truck();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
    }
}
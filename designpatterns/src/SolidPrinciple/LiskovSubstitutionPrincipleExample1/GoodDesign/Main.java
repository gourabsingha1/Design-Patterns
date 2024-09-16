package SolidPrinciple.LiskovSubstitutionPrincipleExample1.GoodDesign;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getNumberOfWheels().toString());
//            System.out.println(vehicle.hasEngine().toString()); // Bicycle has no engine
        }


        List<EngineVehicle> engineVehicleList = new ArrayList<>();
        engineVehicleList.add(new MotorCycle());
        engineVehicleList.add(new Car());
//        engineVehicleList.add(new Bicycle()); // Bicycle is not EngineVehicle
        for(EngineVehicle vehicle : engineVehicleList) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}
package SolidPrinciple.LiskovSubstitutionPrincipleExample1.GoodDesign;

public class Car extends EngineVehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

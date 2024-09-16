package SolidPrinciple.LiskovSubstitutionPrincipleExample1.BadDesign;

public class Car extends Vehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

package SolidPrinciple.LiskovSubstitutionPrincipleExample1.BadDesign;

public class Vehicle {

    public Integer getNumberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}

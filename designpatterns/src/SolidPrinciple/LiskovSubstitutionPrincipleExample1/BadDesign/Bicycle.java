package SolidPrinciple.LiskovSubstitutionPrincipleExample1.BadDesign;

public class Bicycle extends Vehicle {

    @Override
    public Boolean hasEngine() {
        return null;
    }
}

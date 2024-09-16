package SolidPrinciple.LiskovSubstitutionPrincipleExample2.GoodDesign;

// Generic Method (Common for all)
abstract class PaymentProcessor {
    public abstract void processPayment(double amount);
}

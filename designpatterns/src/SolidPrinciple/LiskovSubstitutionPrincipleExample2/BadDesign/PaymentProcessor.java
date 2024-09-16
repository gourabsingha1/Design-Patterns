package SolidPrinciple.LiskovSubstitutionPrincipleExample2.BadDesign;

public class PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }

    public void validateCardDetails(String cardNumber, String cardHolderName) {
        System.out.println("Validating credit card details...");
    }
}
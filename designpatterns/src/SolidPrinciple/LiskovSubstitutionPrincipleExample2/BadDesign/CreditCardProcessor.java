package SolidPrinciple.LiskovSubstitutionPrincipleExample2.BadDesign;

public class CreditCardProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void validateCardDetails(String cardNumber, String cardHolderName) {
        System.out.println("Credit card validated successfully.");
    }
}

package SolidPrinciple.LiskovSubstitutionPrincipleExample2.BadDesign;

public class PayPalProcessor extends PaymentProcessor {
    // PayPal doesn’t use card details for validation
    @Override
    public void validateCardDetails(String cardNumber, String cardHolderName) {
        throw new UnsupportedOperationException("PayPal does not require card details.");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

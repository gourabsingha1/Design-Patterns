package SolidPrinciple.LiskovSubstitutionPrincipleExample2.GoodDesign;

public class CreditCardProcessor extends PaymentProcessor implements CardPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void validateCardDetails(String cardNumber, String cardHolderName) {
        System.out.println("Credit card validated successfully.");
    }
}
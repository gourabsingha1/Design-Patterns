package SolidPrinciple.LiskovSubstitutionPrincipleExample2.BadDesign;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new CreditCardProcessor();
        paymentProcessor.processPayment(100);
        paymentProcessor.validateCardDetails("1234-5678-9123", "John Doe");

        // Replacing with PayPalProcessor
        paymentProcessor = new PayPalProcessor();
        paymentProcessor.processPayment(150);
        paymentProcessor.validateCardDetails("1234-5678-9123", "John Doe");  // Exception will be thrown here
    }
}
package SolidPrinciple.LiskovSubstitutionPrincipleExample2.GoodDesign;

public class Main {
    public static void main(String[] args) {
        CardPaymentProcessor creditCardProcessor = new CreditCardProcessor();
        creditCardProcessor.validateCardDetails("1234-5678-9123", "John Doe");
        ((PaymentProcessor) creditCardProcessor).processPayment(100);

        PaymentProcessor payPalProcessor = new PayPalProcessor();
        payPalProcessor.processPayment(150);
        // No need to call validateCardDetails for PayPalProcessor
    }
}
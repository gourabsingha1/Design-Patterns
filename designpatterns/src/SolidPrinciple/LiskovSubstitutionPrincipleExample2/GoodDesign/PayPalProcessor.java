package SolidPrinciple.LiskovSubstitutionPrincipleExample2.GoodDesign;

public class PayPalProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

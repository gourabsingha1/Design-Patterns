package SolidPrinciple.LiskovSubstitutionPrincipleExample2.GoodDesign;

public interface CardPaymentProcessor {
    void validateCardDetails(String cardNumber, String cardHolderName);
}

package StrategyDesignPattern.GoodDesign;

public class Order {
    private double totalPrice;
    private DiscountStrategy discountStrategy;

    // Inject the discount strategy via constructor
    public Order(double totalPrice, DiscountStrategy discountStrategy) {
        this.totalPrice = totalPrice;
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice() {
        double discount = discountStrategy.applyDiscount(totalPrice);
        return totalPrice - discount;
    }
}

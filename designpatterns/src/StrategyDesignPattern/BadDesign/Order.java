package StrategyDesignPattern.BadDesign;

public class Order {
    private double totalPrice;
    private String discountType;  // Either "seasonal", "loyalty", or "coupon"

    public Order(double totalPrice, String discountType) {
        this.totalPrice = totalPrice;
        this.discountType = discountType;
    }

    public double calculateFinalPrice() {
        double discount = 0.0;

        if ("seasonal".equalsIgnoreCase(discountType)) {
            discount = totalPrice * 0.10;  // 10% seasonal discount
        } else if ("loyalty".equalsIgnoreCase(discountType)) {
            discount = totalPrice * 0.15;  // 15% loyalty discount
        } else if ("coupon".equalsIgnoreCase(discountType)) {
            discount = 50;  // Flat $50 discount for coupon
        }

        return totalPrice - discount;
    }
}

package StrategyDesignPattern.BadDesign;

public class Main {
    public static void main(String[] args) {
        Order seasonalOrder = new Order(500, "seasonal");
        System.out.println("Final Price (Seasonal): $" + seasonalOrder.calculateFinalPrice());

        Order loyaltyOrder = new Order(500, "loyalty");
        System.out.println("Final Price (Loyalty): $" + loyaltyOrder.calculateFinalPrice());

        Order couponOrder = new Order(500, "coupon");
        System.out.println("Final Price (Coupon): $" + couponOrder.calculateFinalPrice());
    }
}

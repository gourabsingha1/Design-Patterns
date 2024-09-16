package StrategyDesignPattern.GoodDesign;

public class Main {
    public static void main(String[] args) {
        // Using Seasonal Discount
        DiscountStrategy seasonalDiscount = new SeasonalDiscount();
        Order seasonalOrder = new Order(500, seasonalDiscount);
        System.out.println("Final Price (Seasonal): $" + seasonalOrder.calculateFinalPrice());

        // Using Loyalty Discount
        DiscountStrategy loyaltyDiscount = new LoyaltyDiscount();
        Order loyaltyOrder = new Order(500, loyaltyDiscount);
        System.out.println("Final Price (Loyalty): $" + loyaltyOrder.calculateFinalPrice());

        // Using Coupon Discount
        DiscountStrategy couponDiscount = new CouponDiscount();
        Order couponOrder = new Order(500, couponDiscount);
        System.out.println("Final Price (Coupon): $" + couponOrder.calculateFinalPrice());

        // Extending the System
        DiscountStrategy blackFridayDiscount = new BlackFridayDiscount();
        Order blackFridayOrder = new Order(500, blackFridayDiscount);
        System.out.println("Final Price (Black Friday): $" + blackFridayOrder.calculateFinalPrice());
    }
}

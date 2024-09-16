package StrategyDesignPattern.GoodDesign;

public class CouponDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return 50;  // Flat $50 coupon discount
    }
}
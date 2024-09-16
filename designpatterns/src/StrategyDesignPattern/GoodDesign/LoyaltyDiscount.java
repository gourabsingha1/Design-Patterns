package StrategyDesignPattern.GoodDesign;

public class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.15;  // 15% loyalty discount
    }
}
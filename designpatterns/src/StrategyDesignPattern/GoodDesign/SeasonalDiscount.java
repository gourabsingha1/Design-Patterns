package StrategyDesignPattern.GoodDesign;

public class SeasonalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.10;  // 10% seasonal discount
    }
}
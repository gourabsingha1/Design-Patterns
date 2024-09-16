package StrategyDesignPattern.GoodDesign;

public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.30;  // 30% Black Friday discount
    }
}
package DecoratorDesignPattern.GoodDesign;

// 2. Concrete Components
// Concrete Pizza 1: Margherita Pizza
public class MargheritaPizza implements Pizza {
    public String getDescription() {
        return "Margherita Pizza";
    }

    public double cost() {
        return 6.99;
    }
}

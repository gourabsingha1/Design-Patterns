package DecoratorDesignPattern.GoodDesign;

// 3. Abstract Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double cost() {
        return tempPizza.cost();
    }
}
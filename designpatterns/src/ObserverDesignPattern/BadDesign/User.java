package ObserverDesignPattern.BadDesign;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void notify(String stockName, double price) {
        System.out.println(name + " notified. New price of " + stockName + ": $" + price);
    }
}

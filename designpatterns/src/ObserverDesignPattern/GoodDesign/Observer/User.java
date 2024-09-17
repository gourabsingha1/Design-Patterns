package ObserverDesignPattern.GoodDesign.Observer;

// Concrete Observer Class
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " notified. New price of " + stockName + ": $" + price);
    }
}

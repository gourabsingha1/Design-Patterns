package ObserverDesignPattern.BadDesign;

public class Stock {
    private String name;
    private double price;
    private User user1;
    private User user2;

    public Stock(String name, double price, User user1, User user2) {
        this.name = name;
        this.price = price;
        this.user1 = user1;
        this.user2 = user2;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyUsers();
    }

    public void notifyUsers() {
        user1.notify(name, price);
        user2.notify(name, price);
    }
}

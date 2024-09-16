package ObserverDesignPattern.BadDesign;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        Stock stock = new Stock("Apple", 150, user1, user2);
        stock.setPrice(155);  // Notify both users
    }
}
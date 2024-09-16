package ObserverDesignPattern.GoodDesign.Observer;

// Extending the System
public class MobileAppNotification implements Observer {
    private String deviceId;

    public MobileAppNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Mobile Notification to device " + deviceId + ": " + stockName + " stock price is now $" + price);
    }
}

package SolidPrinciple.DependencyInversionPrinciple.GoodDesign;

public class PushNotificationService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}

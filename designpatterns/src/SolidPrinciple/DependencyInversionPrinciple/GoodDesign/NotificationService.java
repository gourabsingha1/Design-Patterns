package SolidPrinciple.DependencyInversionPrinciple.GoodDesign;

// High-level module (depends on the abstraction, not the details)
public class NotificationService {
    private NotificationSender notificationSender;

    // Injecting the dependency via constructor
    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.send(message);
    }
}

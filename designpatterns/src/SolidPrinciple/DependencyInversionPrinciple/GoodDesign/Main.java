package SolidPrinciple.DependencyInversionPrinciple.GoodDesign;

public class Main {
    public static void main(String[] args) {
        NotificationSender emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.sendNotification("Hello via email!");

        NotificationSender smsService = new SMSService();
        notificationService = new NotificationService(smsService);
        notificationService.sendNotification("Hello via SMS!");

        // Extending with PushNotification
        NotificationSender pushService = new PushNotificationService();
        notificationService = new NotificationService(pushService);
        notificationService.sendNotification("Hello via Push Notification!");
    }
}

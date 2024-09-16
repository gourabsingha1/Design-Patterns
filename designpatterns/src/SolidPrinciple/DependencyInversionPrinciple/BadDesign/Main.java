package SolidPrinciple.DependencyInversionPrinciple.BadDesign;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, this is a notification!");
    }
}

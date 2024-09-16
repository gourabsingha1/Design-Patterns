package SolidPrinciple.DependencyInversionPrinciple.BadDesign;

/*
Problem:
1. Tight coupling: The NotificationService class depends on both the EmailService and SMSService classes directly.
                   If we need to add a new notification channel like PushNotification, we need to modify the NotificationService class.
2. Difficult to test: Since NotificationService is tightly coupled to the email and SMS services, it's harder to mock these services in unit tests.
*/

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, this is a notification!");
    }
}

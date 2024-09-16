package SolidPrinciple.DependencyInversionPrinciple.BadDesign;

public class NotificationService {
    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void sendNotification(String message) {
        emailService.sendEmail(message);
        smsService.sendSMS(message);
    }
}
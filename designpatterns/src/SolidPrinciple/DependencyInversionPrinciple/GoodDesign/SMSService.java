package SolidPrinciple.DependencyInversionPrinciple.GoodDesign;

public class SMSService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
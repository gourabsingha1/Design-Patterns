package SolidPrinciple.DependencyInversionPrinciple.BadDesign;

public class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
package SolidPrinciple.DependencyInversionPrinciple.GoodDesign;

// Low-level modules (implementing the abstraction)
public class EmailService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
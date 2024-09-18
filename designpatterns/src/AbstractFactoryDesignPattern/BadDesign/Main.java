package AbstractFactoryDesignPattern.BadDesign;

public class Main {
    public static void main(String[] args) {
        String osType = "Windows"; // Hardcoded OS type
        if (osType.equals("Windows")) {
            WindowsButton button = new WindowsButton();
            button.render();
        } else if (osType.equals("Mac")) {
            MacButton button = new MacButton();
            button.render();
        }
    }
}

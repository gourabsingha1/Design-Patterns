package AbstractFactoryDesignPattern.GoodDesign.client;

import AbstractFactoryDesignPattern.GoodDesign.factories.GUIFactory;
import AbstractFactoryDesignPattern.GoodDesign.factories.MacFactory;
import AbstractFactoryDesignPattern.GoodDesign.factories.WindowsFactory;

// Client code
public class UIFactoryDemo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        // Determine the OS type dynamically (Here we just simulate it)
        String osName = System.getProperty("os.name").toLowerCase();
//        String osName = "mac";

        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS: " + osName);
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
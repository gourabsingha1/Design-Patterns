package AbstractFactoryDesignPattern.GoodDesign.client;

import AbstractFactoryDesignPattern.GoodDesign.factories.GUIFactory;
import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Button;
import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Checkbox;

// Client Application that uses the Abstract Factory
class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.render();
        checkbox.render();
    }
}
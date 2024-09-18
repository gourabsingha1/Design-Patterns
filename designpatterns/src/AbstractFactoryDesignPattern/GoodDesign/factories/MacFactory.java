package AbstractFactoryDesignPattern.GoodDesign.factories;

import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Button;
import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Checkbox;
import AbstractFactoryDesignPattern.GoodDesign.products.mac.MacButton;
import AbstractFactoryDesignPattern.GoodDesign.products.mac.MacCheckbox;

// Concrete Factory: Mac Factory
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
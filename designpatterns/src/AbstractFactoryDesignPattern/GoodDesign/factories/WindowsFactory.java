package AbstractFactoryDesignPattern.GoodDesign.factories;

import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Button;
import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Checkbox;
import AbstractFactoryDesignPattern.GoodDesign.products.windows.WindowsButton;
import AbstractFactoryDesignPattern.GoodDesign.products.windows.WindowsCheckbox;

// Concrete Factory: Windows Factory
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
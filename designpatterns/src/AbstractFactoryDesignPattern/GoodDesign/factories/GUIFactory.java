package AbstractFactoryDesignPattern.GoodDesign.factories;

import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Button;
import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Checkbox;

// Abstract Factory: GUIFactory
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
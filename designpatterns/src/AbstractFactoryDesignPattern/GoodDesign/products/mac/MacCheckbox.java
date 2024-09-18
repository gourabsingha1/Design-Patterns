package AbstractFactoryDesignPattern.GoodDesign.products.mac;

import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Checkbox;

// Concrete Product: Mac Checkbox
public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}
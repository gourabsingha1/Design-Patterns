package AbstractFactoryDesignPattern.GoodDesign.products.windows;

import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Checkbox;

// Concrete Product: Windows Checkbox
public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}
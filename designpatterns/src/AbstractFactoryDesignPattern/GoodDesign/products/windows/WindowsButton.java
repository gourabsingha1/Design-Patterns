package AbstractFactoryDesignPattern.GoodDesign.products.windows;

import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Button;

// Concrete Product: Windows Button
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
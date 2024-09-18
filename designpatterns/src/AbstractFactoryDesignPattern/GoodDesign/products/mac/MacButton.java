package AbstractFactoryDesignPattern.GoodDesign.products.mac;

import AbstractFactoryDesignPattern.GoodDesign.products.abstracts.Button;

// Concrete Product: Mac Button
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
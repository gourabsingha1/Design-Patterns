package SolidPrinciple.SingleResponsibilityPrinciple.BadDesign;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Whiteboard Marker", "Black", 2024, 10);
        Invoice invoice = new Invoice(marker, 5);

        int total = invoice.calculateTotal();
        System.out.println("Total cost: " + total);

        invoice.print();
        invoice.saveToDB();
    }
}


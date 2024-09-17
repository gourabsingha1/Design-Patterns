package SolidPrinciple.OpenClosePrinciple.BadDesign;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Sharpie", "Black", 2023, 10);
        Invoice invoice = new Invoice(marker, 5);  // 5 quantities of the marker

        int total = invoice.calculateTotal();
        System.out.println("Total Invoice Amount: " + total);

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();
        invoiceDao.saveToFile("invoice.txt");
    }
}

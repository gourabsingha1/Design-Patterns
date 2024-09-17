package SolidPrinciple.OpenClosePrinciple.GoodDesign;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Red Marker", "Red", 2023, 50);
        Invoice invoice = new Invoice(marker, 2);

        InvoiceDao dbDao = new DatabaseInvoiceDao();
        InvoiceDao fileDao = new FileInvoiceDao();

        dbDao.save(invoice);

        fileDao.save(invoice);

        System.out.println("Total invoice amount: " + invoice.calculateTotal());
    }
}
package SolidPrinciple.SingleResponsibilityPrinciple.GoodDesign;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Expo", "Black", 2022, 15);

        Invoice invoice = new Invoice(marker, 5);

        int total = invoice.calculateTotal();
        System.out.println("Total Invoice Amount: " + total);

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();

        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.print();
    }
}


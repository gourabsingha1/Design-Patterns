package SolidPrinciple.SingleResponsibilityPrinciple.GoodDesign;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println("Here is your invoice");
    }
}
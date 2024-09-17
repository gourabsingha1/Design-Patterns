package SolidPrinciple.SingleResponsibilityPrinciple.GoodDesign;

public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving invoice to db");
    }
}

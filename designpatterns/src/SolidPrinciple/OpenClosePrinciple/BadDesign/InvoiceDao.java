package SolidPrinciple.OpenClosePrinciple.BadDesign;

public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving invoice to db");
    }

    public void saveToFile(String filename) {
        System.out.println("Saving invoice to file with name: " + filename);
    }
}
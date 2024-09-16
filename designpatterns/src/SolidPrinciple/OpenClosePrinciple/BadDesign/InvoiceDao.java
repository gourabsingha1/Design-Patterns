package SolidPrinciple.OpenClosePrinciple.BadDesign;

public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save date into db
    }

    public void saveToFile(String filename) {
        // Save invoice in the file with given filename
    }
}
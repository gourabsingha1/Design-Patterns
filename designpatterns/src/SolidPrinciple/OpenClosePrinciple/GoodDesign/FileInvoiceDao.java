package SolidPrinciple.OpenClosePrinciple.GoodDesign;

public class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}

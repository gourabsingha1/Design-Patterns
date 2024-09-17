package SolidPrinciple.OpenClosePrinciple.GoodDesign;

public class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to file");
    }
}
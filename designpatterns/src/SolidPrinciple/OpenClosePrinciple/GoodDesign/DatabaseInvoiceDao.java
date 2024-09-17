package SolidPrinciple.OpenClosePrinciple.GoodDesign;

public class DatabaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to db");
    }
}

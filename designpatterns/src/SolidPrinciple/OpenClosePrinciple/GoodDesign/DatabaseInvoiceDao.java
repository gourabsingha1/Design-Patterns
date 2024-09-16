package SolidPrinciple.OpenClosePrinciple.GoodDesign;

public class DatabaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        // Save to db
    }
}

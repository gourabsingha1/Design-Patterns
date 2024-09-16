package SolidPrinciple.SingleResponsibilityPrinciple.BadDesign;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // 1st Reason to change
    public int calculateTotal() {
        return ((marker.price) * this.quantity);
    }

    // 2nd Reason to change
    public void print() {
        System.out.println("Here is your invoice");
    }

    // 3rd Reason to change
    public void saveToDB() {
        // Save date into db
    }
}

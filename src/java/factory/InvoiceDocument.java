package src.java.factory;

public class InvoiceDocument implements Document {

    private final String invoiceID;
    private final String totalAmount;

    InvoiceDocument(String invoiceID, String totalAmount) {
        this.invoiceID = invoiceID;
        this.totalAmount = totalAmount;
    }

    public String show() {
        return STR."Invoice ID: \{invoiceID} Total Amount: \{totalAmount}";
    }

    @Override
    public void delete() {
        System.out.println(STR."\{show()} delete");
    }

    @Override
    public void upload() {
        System.out.println(STR."\{show()} uploaded");
    }
}

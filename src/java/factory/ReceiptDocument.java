package src.java.factory;

public class ReceiptDocument implements Document {
    private final String ReceiptID;
    private final String invoiceID;
    private final String paidAmount;

    public ReceiptDocument(String ReceiptID, String invoiceID, String paidAmount) {
        this.ReceiptID = ReceiptID;
        this.invoiceID = invoiceID;
        this.paidAmount = paidAmount;
    }

    public String show() {
        return STR."Receipt ID: \{ReceiptID} Invoice ID: \{invoiceID} Paid Amount: \{paidAmount}";
    }

    @Override
    public void delete() {
        System.out.println(STR."\{show()} deleted");
    }

    @Override
    public void upload() {
        System.out.println(STR."\{show()} uploaded");
    }
}

package src.java.builder.documentType;

public class Receipt {
    private String receiptNumber;
    private String invoiceNumber;
    private String invoiceDate;

    public Receipt(String receiptNumber, String invoiceNumber, String invoiceDate) {
        this.receiptNumber = receiptNumber;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}

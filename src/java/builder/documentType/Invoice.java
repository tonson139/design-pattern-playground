package src.java.builder.documentType;

public class Invoice {
    private String invoiceNumber;
    private String invoiceDate;

    public Invoice(String invoiceNumber, String invoiceDate) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
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

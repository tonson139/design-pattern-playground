package src.java.factory;

public class DocumentBackup {

    public static void main(String[] args) {
        InvoiceDocumentFactory invoiceFactory = new InvoiceDocumentFactory();
        invoiceFactory.setFileLocation("src/java/invoices/");
        Document invoiceDocument = invoiceFactory.getDocument("1000.00");
        execute(invoiceDocument);

        ReceiptDocumentFactory receiptFactory = new ReceiptDocumentFactory();
        receiptFactory.setFileLocation("src/java/receipts/");
        Document receiptDocument = receiptFactory.getDocument("12134", "30");
        execute(receiptDocument);
    }

    private static void execute(Document document) {
        document.upload();
        document.delete();
    }
}

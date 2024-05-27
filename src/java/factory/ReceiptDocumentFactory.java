package src.java.factory;

import java.util.UUID;

public class ReceiptDocumentFactory extends DocumentFactory {
    public Document getDocument(String invoiceID, String paidAmount) {
        String receiptID = STR."REC\{UUID.randomUUID()}";
        return new ReceiptDocument(receiptID, invoiceID, paidAmount);
    }
}

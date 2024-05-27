package src.java.factory;

import java.util.UUID;

public class InvoiceDocumentFactory extends DocumentFactory {
    public Document getDocument(String totalAmount) {
        var invoiceID = STR."INV\{UUID.randomUUID()}";
        return new InvoiceDocument(invoiceID, totalAmount);
    }
}

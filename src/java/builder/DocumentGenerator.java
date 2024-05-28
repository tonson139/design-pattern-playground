package src.java.builder;

import src.java.builder.documentType.Invoice;
import src.java.builder.documentType.Receipt;

public class DocumentGenerator {
    public ExchangeFormatter buildReceipt(ExchangeFormatter builder, Receipt data) {
        builder.setAttribute("invoiceDate", data.getInvoiceDate());
        builder.setAttribute("invoiceNumber", data.getInvoiceNumber());
        builder.setAttribute("receiptNumber", data.getReceiptNumber());
        return builder;
    }

    public ExchangeFormatter buildInvoice(ExchangeFormatter builder, Invoice data) {
        builder.setAttribute("invoiceDate", data.getInvoiceDate());
        builder.setAttribute("invoiceNumber", data.getInvoiceNumber());
        return builder;
    }
}

package src.java.builder;

import src.java.builder.documentType.Invoice;
import src.java.builder.documentType.Receipt;

public class DocumentService {

    public static void main(String[] args) {
        var receipt = new Receipt("REP001", "INV-001", "12-12-2024");
        var invoice = new Invoice("INV-002", "01-01-2024");
        var documentGenerator = new DocumentGenerator();

        // receipt
        System.out.println("====== receipt xml");
        var xmlReceipt = new SimpleXMLBuilder();
        documentGenerator.buildReceipt(xmlReceipt, receipt);
        System.out.println(xmlReceipt.build());

        System.out.println("====== receipt json");
        var jsonReceipt = new SimpleJSONBuilder();
        documentGenerator.buildReceipt(jsonReceipt, receipt);
        System.out.println(jsonReceipt.build());

        // invoice
        System.out.println("====== invoice xml");
        var xmlInvoice = new SimpleXMLBuilder();
        documentGenerator.buildInvoice(xmlInvoice, invoice);
        System.out.println(xmlInvoice.build());

        System.out.println("====== invoice json");
        var jsonInvoice = new SimpleJSONBuilder();
        documentGenerator.buildInvoice(jsonInvoice, invoice);
        System.out.println(jsonInvoice.build());
    }
}

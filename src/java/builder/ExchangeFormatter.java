package src.java.builder;

public interface ExchangeFormatter {
    String  build();

    String getDocumentType();

    String setAttribute(String key, String value);
}

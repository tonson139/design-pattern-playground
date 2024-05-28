package src.java.builder;

import java.util.HashMap;
import java.util.Map;

public class SimpleXMLBuilder implements ExchangeFormatter {
    private final Map<String, String> attributes = new HashMap<>();
    private final StringBuilder result = new StringBuilder("");


    @Override
    public String build() {
        result.append(STR."<document>\n");
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            result.append(STR."  <\{entry.getKey()}>\{entry.getValue()}</\{entry.getKey()}>\n");
        }
        result.append("<\\document>\n");
        return result.toString();
    }

    @Override
    public String getDocumentType() {
        return "XML";
    }

    @Override
    public String setAttribute(String key, String value) {
        if (key == null) throw new IllegalArgumentException("Key and value must not be null");
        return attributes.put(key, value);
    }

}

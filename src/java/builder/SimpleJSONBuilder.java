package src.java.builder;

import java.util.HashMap;
import java.util.Map;

public class SimpleJSONBuilder implements ExchangeFormatter {
    private final Map<String, String> attributes = new HashMap<>();
    private final StringBuilder result = new StringBuilder("");


    @Override
    public String build() {
        result.append(STR."{\n");
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            result.append(STR."  \"\{entry.getKey()}\": \"\{entry.getValue()}\",\n");
        }
        result.append(STR."}");
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

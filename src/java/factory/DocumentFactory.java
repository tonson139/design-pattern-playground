package src.java.factory;

public abstract class DocumentFactory {
    private String  path = "src/java/";
    public void setFileLocation(String path) {
        this.path = path;
    }
}

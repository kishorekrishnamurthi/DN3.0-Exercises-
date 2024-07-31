// ProxyDocument.java
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String filename;
    private boolean isAuthenticated;

    public ProxyDocument(String filename, boolean isAuthenticated) {
        this.filename = filename;
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public void display() {
        if (isAuthenticated) {
            if (realDocument == null) {
                realDocument = new RealDocument(filename);
            }
            realDocument.display();
        } else {
            System.out.println("Access denied. You do not have permission to view this document.");
        }
    }
}

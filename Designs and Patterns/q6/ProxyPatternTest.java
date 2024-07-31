// ProxyPatternTest.java
public class ProxyPatternTest {
    public static void main(String[] args) {
        Document document1 = new ProxyDocument("document1.pdf", true); // User is authenticated
        Document document2 = new ProxyDocument("document2.pdf", false); // User is not authenticated

        System.out.println("Attempting to display authenticated document:");
        document1.display(); // Should display the document

        System.out.println("\nAttempting to display unauthenticated document:");
        document2.display(); // Should deny access
    }
}

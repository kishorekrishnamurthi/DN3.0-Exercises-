// SearchTest.java
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
            new Product("001", "Laptop", "Electronics"),
            new Product("002", "Smartphone", "Electronics"),
            new Product("003", "Coffee Maker", "Home Appliances"),
            new Product("004", "Blender", "Home Appliances")
        };

        // Sort products by productId for binary search
        Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));

        // Test Linear Search
        System.out.println("Testing Linear Search:");
        Product linearResult = LinearSearch.search(products, "003");
        System.out.println(linearResult != null ? linearResult : "Product not found");

        // Test Binary Search
        System.out.println("\nTesting Binary Search:");
        Product binaryResult = BinarySearch.search(products, "003");
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
    }
}

// LinearSearch.java
public class LinearSearch {
    public static Product search(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null; // Product not found
    }
}

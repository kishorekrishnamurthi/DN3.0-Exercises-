// Inventory.java

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the inventory management system.
 */
class Inventory {
    private Map<Integer, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Method to update a product in the inventory
    public void updateProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
        }
    }

    // Method to delete a product from the inventory
    public void deleteProduct(int productId) {
        products.remove(productId);
    }

    // Method to get a product from the inventory
    public Product getProduct(int productId) {
        return products.get(productId);
    }
}


public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Create products
        Product product1 = new Product(1, "Product 1", 10, 9.99);
        Product product2 = new Product(2, "Product 2", 20, 19.99);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Update a product
        product1.setQuantity(15);
        inventory.updateProduct(product1);

        // Delete a product
        inventory.deleteProduct(2);

        // Get a product
        Product retrievedProduct = inventory.getProduct(1);
        System.out.println("Product Name: " + retrievedProduct.getProductName());
        System.out.println("Quantity: " + retrievedProduct.getQuantity());
        System.out.println("Price: " + retrievedProduct.getPrice());
    }
}
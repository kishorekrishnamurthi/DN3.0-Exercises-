// QuickSort.java
public class QuickSort {
    // Method to perform quick sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice(); // pivot element
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        // Swap orders[i + 1] and orders[high] (or pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Soumik Saha", 2500.50),
                new Order(2, "Sougata Maity", 1500.25),
                new Order(3, "Tathagata Pal", 5000.00)
        };

        System.out.println("Before Sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

        quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

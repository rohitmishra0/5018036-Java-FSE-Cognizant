import java.util.Scanner;

//Defining class Order
class Order {
    int orderId;
    String customerName;
    double totalPrice;

    //Constructor
    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Customer: " + customerName + ", Total Price: $" + totalPrice;
    }
}

public class OrderSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        // Input many orders
        System.out.print("Enter the number of orders: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumes newline

        Order[] orders = new Order[n];

        // Input orders
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for order " + (i + 1) + ":");
            System.out.print("Order ID: ");
            int orderId = scanner.nextInt();
            scanner.nextLine(); // Consumes newline
            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Total Price: ");
            double totalPrice = scanner.nextDouble();
            scanner.nextLine(); // Consumes newline
            orders[i] = new Order(orderId, customerName, totalPrice);
        }

        // Displays unsorted orders
        System.out.println("\nUnsorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        bubbleSort(orders);
        System.out.println("\nOrders Sorted using Bubble Sort method:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        scanner.close();
    }

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    // Swapping orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void swap(Order[] orders, int i, int j) {
        Order temp = orders[i];
        orders[i] = orders[j];
        orders[j] = temp;
    }

    public static void quickSort(Order[] orders, int l, int r) {
        if (l >= r)
            return;

        // Choose pivot element
        int pivotIndex = (l + r) / 2;
        double pivotValue = orders[pivotIndex].totalPrice;

        // Move pivot element to the first position
        swap(orders, l, pivotIndex);

        int last = l;
        for (int i = l + 1; i <= r; i++) {
            if (orders[i].totalPrice < pivotValue) {
                last++;
                swap(orders, last, i);
            }
        }

        // Move pivot to its final position
        swap(orders, l, last);

        // Recursively sort the partitions
        quickSort(orders, l, last - 1);
        quickSort(orders, last + 1, r);
    }
}

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Products {

    // Method to calculate total amount
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].price * products[i].quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Enter product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        double maxPrice = products[0].price;
        int maxPricePid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPricePid = products[i].pid;
            }
        }

        // Calculate total amount spent
        double totalAmount = calculateTotalAmount(products);

        // Output results
        System.out.println("Product ID with the highest price: " + maxPricePid);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }
}

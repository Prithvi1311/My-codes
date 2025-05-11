import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = scan.nextDouble();
        double discount = 0;

        if (amount < 500) {
            System.out.println("No discount is applied.");
        } else if (amount >= 500 && amount <= 1000) {
            discount = amount * 10 / 100;
            System.out.println("10% discount is applied.");
        } else if (amount > 1000) {
            discount = amount * 20 / 100;
            System.out.println("20% discount is applied.");
        }

        double finalAmount = amount - discount;
        System.out.println("Final payable amount: " + finalAmount);

        scan.close();
    }
}

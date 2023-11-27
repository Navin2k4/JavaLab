import java.util.Scanner;
public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unit price of the product: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter quantity of the product sold: ");
        int quantity = scanner.nextInt();
        double discountRate;
        if (quantity < 100) {
            discountRate = 0.0;
        } else if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.1;
        } else {
            discountRate = 0.15;
        }
        double totalPrice = unitPrice * quantity;
        double discountAmount = totalPrice * discountRate;
        double revenue = totalPrice - discountAmount;
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Revenue: $" + revenue);
        scanner.close();
    }
}

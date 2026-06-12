package DAY4;
import java.util.Scanner;

public class DiscoutCalculation {

    static double calculateDiscount(double bill) {

        if (bill >= 5000) {
            return bill * 0.25;
        } else if (bill > 2000) {
            return bill * 0.20;
        } else if (bill > 1000) {
            return bill * 0.10;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        double discount = calculateDiscount(bill);
        double finalBill = bill - discount;

        System.out.println("Bill Amount = Rs. " + bill);
        System.out.println("Discount = Rs. " + discount);
        System.out.println("Final Bill = Rs. " + finalBill);

        sc.close();
    }
}
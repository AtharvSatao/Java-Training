package DAY3.DoWhileLoop;

import java.util.Scanner;

public class WelcomeCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char customer;
        do {
            System.out.println("Welcome");
            System.out.print("Do you want to welcome another customer? (Y/N): ");
            customer = sc.nextLine().charAt(0);
        } while (customer == 'Y');
    }
}

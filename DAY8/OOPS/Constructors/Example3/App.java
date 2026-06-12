package DAY8.OOPS.Constructors.Example3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SBI cust = new SBI(
                "Rohit Sharma",
                "SBIN09768COR",
                10000
        );

        int choice;

        while (true) {

            System.out.println("\n===== SBI MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Current Balance");
            System.out.println("4. Check Account");
            System.out.println("5. Show Details");
            System.out.println("6. Bank Mai Chori");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    double dep = sc.nextDouble();
                    cust.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    double with = sc.nextDouble();
                    cust.withdraw(with);
                    break;

                case 3:
                    cust.currentBalance();
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = sc.next();
                    cust.checkAccount(accountNumber);
                    break;

                case 5:
                    cust.showDetails();
                    break;

                case 6:
                    SBI.BankMaiChori();
                    break;

                case 7:
                    System.out.println("Thank You for Banking with SBI!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        }
    }
}
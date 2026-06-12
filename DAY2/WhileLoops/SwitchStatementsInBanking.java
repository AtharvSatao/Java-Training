package DAY2.WhileLoops;

import java.util.Scanner;

public class SwitchStatementsInBanking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        while (true) {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. FD Maturity Amount (2 Years)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance = Rs. " + balance);
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    balance += deposit;
                    System.out.println("Deposit Successful!");
                    System.out.println("Updated Balance = Rs. " + balance);
                    break;

                case 3:
                    System.out.println("Current Balance = Rs. " + balance);
                    break;

                case 4:
                    double rate = 7;
                    int time = 2;

                    double interest = (balance * rate * time) / 100;
                    double maturityAmount = balance + interest;

                    System.out.println("Principal Amount = Rs. " + balance);
                    System.out.println("Rate = " + rate + "%");
                    System.out.println("Time = " + time + " years");
                    System.out.println("Interest Earned = Rs. " + interest);
                    System.out.println("FD Maturity Amount = Rs. " + maturityAmount);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
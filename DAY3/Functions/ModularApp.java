package DAY3.Functions;
import java.util.Scanner;

public class ModularApp {

    static int withdraw(int balance, int amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance = Rs. " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
        return balance;
    }

    static int deposit(int balance, int amt) {
        balance += amt;
        System.out.println("Deposit Successful!");
        System.out.println("Updated Balance = Rs. " + balance);
        return balance;
    }

    static void checkBalance(int balance) {
        System.out.println("Current Balance = Rs. " + balance);
    }

    static void calculateFDMaturity(int balance) {
        double rate = 7.5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in years for FD: ");
        int time = sc.nextInt();

        double SI = (balance * rate * time) / 100;

        System.out.println("Principal Amount = Rs. " + balance);
        System.out.println("Rate = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("Simple Interest = Rs. " + SI);
        System.out.println("FD Maturity Amount = Rs. " + (balance + SI));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 100000;

        while (true) {

            System.out.println("\nBanking System");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. FD Maturity Amount (2 Years)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exit Successful!");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmt = sc.nextInt();
                    balance = withdraw((int) balance, withdrawAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmt = sc.nextInt();
                    balance = deposit((int) balance, depositAmt);
                    break;

                case 3:
                    checkBalance((int) balance);
                    break;

                case 4:
                    calculateFDMaturity((int) balance);
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
        sc.close();
    }
}
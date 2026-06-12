package DAY8.OOPS.Constructors.Example1;

public class HDFC {
    String name;
    int AccNO;
    double balance;

    // Parameterized Constructor
    HDFC(String Username, int UserAccNO, double Userbalance) {
        this.name = Username;
        this.AccNO = UserAccNO;
        this.balance = Userbalance;
    }

    void Deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void Withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Debited: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void PrintCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + AccNO);
        System.out.println("Balance: " + balance);
    }
}
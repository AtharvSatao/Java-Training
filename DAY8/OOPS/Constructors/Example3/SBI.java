package DAY8.OOPS.Constructors.Example3;

public class SBI {

    String name;
    String accNo;
    double balance;
    String accountType;

    SBI() {
        name = "Unknown";
        accNo = "SBIN0000DEF";
        balance = 0;
        accountType = "Savings Account";
    }

    SBI(String name, String accNo, double balance) {

        this.name = name;
        this.accNo = accNo;
        this.balance = balance;

        if (accNo.equals("SBIN09768COR")) {
            this.accountType = "Personal Account";
        }
        else if (accNo.equals("SBIN6864BUIS")) {
            this.accountType = "Business Account";
        }
        else {
            this.accountType = "Savings Account";
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void currentBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    void checkAccount(String accNo) {

    if (accNo.equals("SBIN09768COR")) {
        System.out.println("Valid SBI Account");
        System.out.println("Account Type: Personal Account");
    }

    else if (accNo.equals("SBIN6864BUIS")) {
        System.out.println("Valid SBI Account");
        System.out.println("Account Type: Business Account");
    }

    else if (accNo.startsWith("SBIN")) {
        System.out.println("Valid SBI Account");
        System.out.println("Account Type: Savings Account");
    }

    else {
        System.out.println("Invalid SBI Account");
    }
    }

    void showDetails() {

        System.out.println("\n----- Customer Details -----");
        System.out.println("Name         : " + name);
        System.out.println("Account No   : " + accNo);
        System.out.println("Balance      : Rs." + balance);
        System.out.println("Account Type : " + accountType);
    }

    static void BankMaiChori() {
        System.out.println(" Alert! Bank Mai Chori Ho Gayi!");
    }
}
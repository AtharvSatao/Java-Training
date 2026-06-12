package DAY9.Inheritance.Example2;

public class Account {
    int AccountNumber;
    String HolderName;
    Double Balance;

    Account(int AccountNumber, String HolderName, double Balance){
        this.AccountNumber = AccountNumber;
        this.HolderName = HolderName;
        this.Balance = Balance;

        System.out.println("Account Constructor");

    }

    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }

        Balance += amount;
    }

    void withdraw(double amount) {

        if (amount > Balance) {
            System.out.println("Insufficient Balance");
            return;
        }

        Balance -= amount;
    }

    void display() {

        System.out.println(AccountNumber + " " +
                HolderName + " " +
                Balance);
    }

    double getBalance() {
        return Balance;
    }
}

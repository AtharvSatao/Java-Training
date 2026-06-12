package DAY9.Inheritance.Example2;

public class CurrentAccount extends Account{
    double OverdraftLimit;

    CurrentAccount(int AccountNumber, String HolderName, double Balance, double OverdraftLimit){
        super(AccountNumber, HolderName, Balance);
        this.OverdraftLimit = OverdraftLimit;
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
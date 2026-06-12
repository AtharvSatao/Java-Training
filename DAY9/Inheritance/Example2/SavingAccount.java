package DAY9.Inheritance.Example2;

public class SavingAccount extends Account{
    double InterestRate;

    SavingAccount(int AccountNumber, String HolderName, double Balance, double InterestRate){
        super(AccountNumber, HolderName, Balance);
        this.InterestRate = InterestRate;
    }

    double calculateInterest() {
        return Balance * InterestRate / 100;
    }

    //@Override
    void Display(){

        System.out.println("Saving Account");
        System.out.println(AccountNumber + " " +
                HolderName + " " +
                Balance + " " +
                InterestRate);
    }
}


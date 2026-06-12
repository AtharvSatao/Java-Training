package DAY10.AbstractClasses.Example1;

public class CorporateAccount extends Account {
    
    CorporateAccount(String name, double balance){
        super(name, balance);
    }

    @Override
    void withdraw(double amt){
        if(balance-amt >= 1000){
            balance -= amt;
        }
        else{
            System.out.println("Min balance is Req for this Account");
        }
    }
    // void deposit(double amt){
    //     System.out.println("");
    //     balance+= amt;
    // }
}

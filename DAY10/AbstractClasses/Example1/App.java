package DAY10.AbstractClasses.Example1;

public class App {
    public static void main(String[] args) {
        Account a1 = new CorporateAccount("Varun", 10000);

        a1.deposit(5000);

        a1.withdraw(2000);
        System.out.println(a1);
    }
    
}

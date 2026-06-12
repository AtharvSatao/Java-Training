package DAY8.OOPS.Constructors.Example1;

public class App {
    public static void main(String[] args) {

        HDFC customer1 = new HDFC("Atharv", 12345, 5000);

        customer1.PrintCustomerDetails();

        customer1.Deposit(2000);
        customer1.Withdraw(1500);

        System.out.println("\nAfter Transactions:");
        customer1.PrintCustomerDetails();
    }
}
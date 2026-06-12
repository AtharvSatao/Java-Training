package DAY8.OOPS.Constructors.Example2;

public class Products {

    String name;
    int Price;
    String Availability;
    
    Products(){
       //System.out.println("Default Constructor Called!!!"); 
       name = "Item";
       Price = 00;
       Availability= "False";
    }

    void Deposit(){
        System.out.println("Amount Deposited!!!"); 
    }
    void Withdraw(){
        System.out.println("Amount Debited!!!"); 
    }
}



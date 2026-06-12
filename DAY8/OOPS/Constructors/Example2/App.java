package DAY8.OOPS.Constructors.Example2;

import DAY8.OOPS.Constructors.Example1.HDFC;

public class App {
        public static void main(String[] args) {
            Products P1 = new Products();
            Products P2 = new Products();
            Products P3 = new Products();
            Products P4 = new Products();
            
            P1.name = "Pen";
            P1.Price = 10;
            P1.Availability = "Available";
            

            System.out.println("A "+P1.name + " of Rs "+ P1.Price + " Is " + P1.Availability);
            System.out.println(P4.name);
            System.out.println(P3.Price);
            System.out.println(P2.Availability);
        }
    }
    




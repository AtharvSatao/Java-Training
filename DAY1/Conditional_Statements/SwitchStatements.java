package DAY1.Conditional_Statements;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("1.Paratha 2.Chai 3.Sandwhich 4.Samosa");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            int option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Take your Paratha");
                    break;
                case 2:
                    System.out.println("Take your Chai");
                    break;
                case 3:
                    System.out.println("Take your Sandwhich");
                    break;
                case 4:
                    System.out.println("Take your Samosa");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
    }
}

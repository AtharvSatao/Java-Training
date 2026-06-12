package DAY1.Introduction;
import java.util.Scanner;
public class SwapNumbersUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        
        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        int x;
        x = a;
        a = b;
        b = x;

        System.out.println("After swapping:");
        System.out.println("a number = " + a);
        System.out.println("b number = " + b);
        sc.close();
    }
}
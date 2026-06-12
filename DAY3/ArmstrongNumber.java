package DAY3;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        
        int num;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        int temp = num;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            int power = (int) Math.pow(digit, count);
            sum = sum + power;
            temp = temp / 10;
        }
        
        if (sum == num) {
            System.out.println(num + " is Armstrong number.");
        } 
        else {
            System.out.println(num + " is not Armstrong number.");
        }
    }

}

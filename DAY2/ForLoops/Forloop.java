package DAY2.ForLoops;
import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}

package DAY3.DoWhileLoop;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int guess;
        int count = 0;
        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            count++;
            if (guess < num) {
                System.out.println("Lower No");
            } else if (guess > num) {
                System.out.println("Higher No");
            } else {
                System.out.println("Congratulations!");
            }
        } while (guess != num);
        System.out.println("Total attempts: " + count);
    }
}
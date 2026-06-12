package DAY2.ForLoops;
import java.util.Scanner;

public class UpperRightPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the pattern: ");
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(pattern + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
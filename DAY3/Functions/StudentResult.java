package DAY3.Functions;
import java.util.Scanner;
public class StudentResult {

    static int calculateSum(int[] marks) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum;
    }

    static double calculatePercentage(int sum) {
        return (sum / 500.0) * 100;
    }

    static char calculateGrade(double percentage) {

        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int sum = calculateSum(marks);
        double percentage = calculatePercentage(sum);
        char grade = calculateGrade(percentage);

        System.out.println("\nTotal Marks = " + sum);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
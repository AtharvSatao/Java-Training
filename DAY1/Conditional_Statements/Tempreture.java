package DAY1.Conditional_Statements;
import java.util.Scanner;
public class Tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temp in Celsius: ");
        int celsius = sc.nextInt();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temp in Fahrenheit: " + fahrenheit);
    }
}

package DAY4.Recursion;

public class ReverseNo {

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        return reverse(n / 10, rev * 10 + rem);
    }

    public static void main(String[] args) {
        int number = 1234;
        int result = reverse(number, 0);
        System.out.println("Reversed Number: " + result);
    }
}
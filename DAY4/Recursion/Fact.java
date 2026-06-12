package DAY4.Recursion;
public class Fact {
    static int fact (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
    int n = 5;
    int result = fact(n);
    System.out.println("The factorial of " + n + " is: " + result);
    }
}



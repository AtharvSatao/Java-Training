package DAY3.Functions;
public class PrimeNumbers {
    static boolean Prime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
package DAY2.WhileLoops;

public class SmallestDigit {
    public static void main(String[] args) {
        int num =23456;
        int smallest= 9;

        while (num != 0) {
            int digit = num % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            num = num / 10;
        }
        System.out.println("Smallest digit = " + smallest);                   
    }
}

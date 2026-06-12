package DAY2.WhileLoops;
public class HighestDigit {
    public static void main(String[] args) {
        int num = 7943;
        int highest = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit > highest) {
                highest = digit;
            }
            num = num / 10;
        }
        System.out.println("Highest digit = " + highest);
    }
}

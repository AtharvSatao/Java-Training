package DAY2.ForLoops;
public class UpperLeftPyramid {
    public static void main(String[] args) {
        String pattern = "*";

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pattern + "   ");
            }
            System.out.println();
        }
    }
}
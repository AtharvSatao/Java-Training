package DAY2.ForLoops;
public class LeftPyramid {
    public static void main(String[] args) {     
        String pattern = "*";

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pattern + " ");
            }
            System.out.println();
        }
    }
}
package DAY2.ForLoops;

public class ReverceRhombus {
     public static void main(String[] args) {
        int line = 5;
        for (int row =1; row<=line; row++){
            for (int space = 1; space < row; space++){
                System.out.print("   ");
            }
            for (int star = 1; star <= line; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
     }  
}

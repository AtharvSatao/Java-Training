package DAY1.Introduction;
// public class StudentRecord {
//     public static void main(String[] args) {
//         String name = "John";
//         int Maths = 80;
//         int Science= 30;
//         int English = 40;
//         int total = Maths + Science + English;
//         double percentage = (total / 300) * 100;
//         System.out.println("Name: " + name);
//         System.out.println("Percentage: " + percentage);
//     }
// }


import java.util.Scanner;
public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        int total = maths + science + english;
        double percentage = (total / 300) * 100;
        System.out.println("\nName: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
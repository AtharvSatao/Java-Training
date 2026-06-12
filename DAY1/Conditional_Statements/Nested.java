package DAY1.Conditional_Statements;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        int tenth=80;
        int twelth=80;
        double CG=7.5;
        int placement=85;

        // System.out.println("Enter your 10th percentage, 12th percentage, CGPA and placement: ");
        // Scanner sc = new Scanner(System.in);
        // tenth= sc.nextInt();
        // twelth= sc.nextInt();
        // CG= sc.nextInt();
        // placement= sc.nextInt();

        if (tenth > 70) {
           if(twelth > 70) {
               if(CG > 7.0) {
                   if(placement > 80) {
                       System.out.println("Placement Cracked");
                   }
                   else {
                       System.out.println("You are not eligible for the job");
                   }
               }
               else {
                   System.out.println("You are not eligible for the job");
               }
           }
           else {
               System.out.println("You are not eligible for the job");
           }
        }
    }
}
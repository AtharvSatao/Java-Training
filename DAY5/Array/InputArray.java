package DAY5.Array;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc=new Scanner(System.in);

        for (int i=0; i<arr.length; i++){
                System.out.println("Enter Your Elements:- ");
                System.out.println(arr[i]);
                arr[i]=sc.nextInt();
            }

        System.out.println("Elements are:- ");
    }
    
    
}

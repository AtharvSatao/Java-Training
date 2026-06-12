package DAY5.Array;

import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
     
        int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    
    for (int i=0; i<arr.length; i++){
            System.out.print("Enter Your "+(i+1) +" Element:- ");
            arr[i]=sc.nextInt();
        }
    int sum=0;
    for(int i=0; i<arr.length; i++){
        sum = sum + arr[i];

    }
    System.out.println("sum of Array is= "+sum);
    System.out.println("Average of Array is= "+ sum/arr.length);
    }
}

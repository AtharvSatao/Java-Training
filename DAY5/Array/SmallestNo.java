package DAY5.Array;
import java.util.Scanner;

public class SmallestNo {
    
    public static void main(String[] args) {
     
        int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    
    for (int i=0; i<arr.length; i++){
            System.out.print("Enter Your "+(i+1) +" Element:- ");
            arr[i]=sc.nextInt();
    }
    int min = arr[0]; 
    for(int i=0; i<arr.length; i++){
        if(min>arr[i]){
            min=arr[i];
        }
    }
    System.out.println("Largest No is:- " + min);    
    }
}

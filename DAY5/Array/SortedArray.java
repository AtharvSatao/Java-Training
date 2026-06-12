package DAY5.Array;
//import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        
        int flag=0;
        int arr[] = {2,4,7,9,12,15};
        for (int i =0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                flag++;
                System.out.println("Its not Sorted");
            }
        }

        if(flag==0){
            System.out.println("Its Sorted");
        }

    }
}


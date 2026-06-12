package DAY5.Array;

public class BinarySearch {
    static int search(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        } 
        return -1;

    }
    
    public static void main(String[] args) {
        int arr[] = {3,6,9,10,15,20};
        int key = 6;
        int index = search(arr, key);

        if (index != -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("Element found:- " + index);
        }
    }
}
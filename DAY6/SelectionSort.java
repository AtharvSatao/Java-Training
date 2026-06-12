package DAY6;

public class SelectionSort {
    static void Ssort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;     
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 5, 1, 3, 8, 2};

        Ssort(arr);
        System.out.print("Sorted Array:- ");

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

}
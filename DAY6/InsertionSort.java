package DAY6;

public class InsertionSort {
    
    static void Isort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            
            while(arr[j]>= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {8,3,5,4,6};
        Isort(arr);

        System.err.println("Insertion Sort Array: ");
        for (int item : arr) {
            System.out.print(""+ item + " ");
        }
        
    }
}
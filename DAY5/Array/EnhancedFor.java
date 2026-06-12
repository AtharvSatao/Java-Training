package DAY5.Array;

public class EnhancedFor {
    public static void main(String[] args) {
        String Emp[] = {"Pankaj","Chinki","Pinki","Ram","Shyam"};
        for(String name: Emp){
            System.out.println(""+ name);
        }

        int arr[] = {4, 8, 7, 2, 1};
        int largest = arr[0];

        for(int item : arr){
            if(item>largest){
                largest = item;
            }
        }
        System.out.println("Largest = " + largest);
    }
}

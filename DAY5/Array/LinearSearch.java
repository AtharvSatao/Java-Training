package DAY5.Array;

public class LinearSearch {

    static int Search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 8, 7, 0};

        int key = 8;

        int index = Search(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
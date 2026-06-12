package DAY6;

public class MoveZeros {
    static void ZeroToEnd(int arr[]) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 0, 4};
        ZeroToEnd(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
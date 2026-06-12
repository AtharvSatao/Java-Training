package DAY5.Array;

public class BubbleSort {

    static void Bsort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int flag = 0;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    flag++;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // Array already sorted
            if (flag == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {7, 5, 1, 3, 8, 2};

        Bsort(arr);

        System.out.println("Sorted Array:");

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
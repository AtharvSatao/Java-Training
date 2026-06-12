package DAY5.Array;

public class FindElement {
    static void getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index");
            return;
        }
        System.out.println("Element is: " + arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        getElement(arr, 3);
    }
}
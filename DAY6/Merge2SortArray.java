package DAY6;

public class Merge2SortArray {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};
        int n = arr1.length;
        int m = arr2.length;

        int resultantArr[] = new int[n + m];

        int i=0;
        int j=0;
        int k=0;
        while(i<n && i<m){
            if(arr1[i]<arr2[j]){
                resultantArr[k] = arr1[i];
                k++;
                i++;
            }
            else{
                resultantArr[k]= arr2[j];
                k++;
                i++;
            }
        }
        while (i < n) {
            resultantArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            resultantArr[k] = arr2[j];
            j++;
            k++;
        }

        System.out.print("Merged Array: ");

        for (int item : resultantArr) {
            System.out.print(item + " ");
        }
    }
}
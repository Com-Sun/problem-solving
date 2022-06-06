package algorithm.sorting.insertion;

public class Insertion2 {
    public static void sort(int[] arr) {
        sort(arr, arr.length);
    }

    private static void sort(int[] arr, int length) {
        for (int i = 1; i < length; i ++) {
            int target = arr[i];
            int j = i - 1;

            while (j >=0 & target < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = target;
        }
    }
}

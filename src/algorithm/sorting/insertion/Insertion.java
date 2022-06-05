package algorithm.sorting.insertion;

public class Insertion {
    public static void sort(int[] arr) {
        sort(arr, arr.length);
    }

    private static void sort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && target <= arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = target;
        }
    }
}

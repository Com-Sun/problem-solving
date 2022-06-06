package algorithm.sorting.bubble;

public class Bubble2 {
    public static void sort(int[] arr) {
        sort(arr, arr.length);
    }

    private static void sort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(j-1, j, arr);
                }
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


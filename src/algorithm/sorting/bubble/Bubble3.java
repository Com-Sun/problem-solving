package algorithm.sorting.bubble;

public class Bubble3 {

    public static void sort(int[] arr) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(j - 1, j, arr);
                }
            }
        }
    }

    private static void swap(int left, int right, int[] arr) {
        
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

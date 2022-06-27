package algorithm.sorting.selection;

public class Selection5 {

    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex, arr);
        }
    }

    private static void swap(int i, int minIndex, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

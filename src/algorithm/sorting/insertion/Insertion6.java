package algorithm.sorting.insertion;

public class Insertion6 {

    public static void sort(int[] arr) {

        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }
    }
}

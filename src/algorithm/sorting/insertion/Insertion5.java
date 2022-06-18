package algorithm.sorting.insertion;

public class Insertion5 {

    public static void sort(int[] arr) {

        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }
}

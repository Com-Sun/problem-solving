package algorithm.sorting.shell;

import java.awt.print.Pageable;

public class Shell2 {

    private final static int[] gap =
        {1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 8858, 19930, 44842, 100894, 227011, 510774,
            1149241, 2585792, 5818032, 13090572, 29453787, 66271020, 149109795, 335497038,
            754868335, 1698453753};


    public static void sort(int[] arr) {
        int size = arr.length;
        int gapIndex = getGap(size);

        while (gapIndex >= 0) {
            int step = gap[gapIndex--];
            for (int i = step; i < size; i++) {
                for (int j = i; j >= step && arr[j] < arr[j - step]; j -= step) {
                    swap(j, j - step, arr);
                }
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int getGap(int size) {
        int index = 0;
        int length = (int) (size / 2.25);
        while (gap[index] < length) {
            index++;
        }
        return index;
    }
}

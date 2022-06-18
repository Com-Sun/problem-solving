package algorithm.sorting.shell;

public class Shell {

    private final static int[] gap =
        {1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
            8858, 19930, 44842, 100894, 227011, 510774,
            1149241, 2585792, 5818032, 13090572, 29453787,
            66271020, 149109795, 335497038, 754868335, 1698453753};

    public static void sort(int[] arr) {

        int size = arr.length;
        int index = getGap(size);

        for (int i = index; i >= 0; i--) {

            for (int j = 0; j < gap[i]; j++) {
                sort(arr, j, size, gap[i]);
            }
        }
    }

    private static void sort(int[] arr, int start, int size, int gap) {

        for (int i = start + gap; i < size; i += gap) {

            int target = arr[i];
            int j = i - gap;

            while (j >= start && target < arr[j]) {
                arr[j + gap] = arr[j];
                j -= gap;
            }

            arr[j + gap] = target;
        }
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

package algorithm.sorting.shell.sortingnum3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Shell Sort 사용
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sort(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private final static int[] gap =
        {1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
            8858, 19930, 44842, 100894, 227011, 510774,
            1149241, 2585792, 5818032, 13090572, 29453787,
            66271020, 149109795, 335497038, 754868335, 1698453753};

    public static void sort(int[] arr) {
        int size = arr.length;
        int gapIndex = getGap(size);

        while (gapIndex >= 0) {
            int step = gap[gapIndex--];

            for (int i = step; i < size; i++) {
                int target = arr[i];
                int j = i - step;

                while (j >= 0 && target < arr[j]) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = target;
            }
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

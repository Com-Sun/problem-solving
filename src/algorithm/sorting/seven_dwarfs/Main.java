package algorithm.sorting.seven_dwarfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        List<Integer> arr = new ArrayList<>();
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            arr.add(Integer.parseInt(str));
        }

        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }

        int first = 0;
        int second = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (sum - arr.get(i) - arr.get(j) == 100) {
                    first = arr.get(i);
                    second = arr.get(j);
                    break;
                }
            }
        }

        List<Integer> returnArr = arr.stream().sorted().collect(Collectors.toList());

        for (Integer integer : returnArr) {
            if (integer != first && integer != second) {
                System.out.println(integer);
            }
        }
    }
}

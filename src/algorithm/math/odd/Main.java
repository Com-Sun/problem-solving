package algorithm.math.odd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> nums = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 7; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> oddNums = nums.stream()
                                    .filter(num -> num % 2 == 1)
                                    .sorted()
                                    .collect(Collectors.toList());


        if (oddNums.isEmpty()) {
            System.out.println("-1");
        } else {
            int sum = 0;

            for (Integer oddNum : oddNums) {
                sum += oddNum;
            }
            System.out.println(sum);
            System.out.println(oddNums.get(0));
        }
    }
}

package algorithm.sorting.programmers.largest_num;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numbers) {
        String answer = IntStream.of(numbers)
            .mapToObj(String::valueOf)
            .sorted((a, b) -> (b + a).compareTo(a + b)) //compareTo : lang
            .collect(Collectors.joining());

        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }


}

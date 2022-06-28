package algorithm.sorting.programmers.k_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();
        for (int[] command : commands) {
            int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(temp);
            answerList.add(temp[command[2] - 1]);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
package algorithm.sorting.programmers.h_index;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int size = citations.length;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int citation : citations) {
                if (citations[i] >= citation) {
                    count++;
                }
            }
            if (count >= citations[i]) {
                answer = citations[i];
            }
        }
        return answer;
    }
}
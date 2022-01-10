package dataStructure.deque.deque;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        // 시간제한이 0.5초로 짧기에 BufferedReader와 StringBuilder를 사용.
        // 덱 자료구조 생성

        int count = 0;
        for (int i = 0; i < n; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push_front" :
                    int num = Integer.parseInt(st.nextToken());
                    deque.offerFirst(num);
                    count++;
                    break;
                case "push_back" :
                    num = Integer.parseInt(st.nextToken());
                    deque.offerLast(num);
                    count++;
                    break;
                case "pop_front" :
                    if (count == 0) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(deque.pollFirst()).append(" \n");
                        count--;
                    }
                    break;
                case "pop_back" :
                    if (count == 0) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(deque.pollLast()).append(" \n");
                        count--;
                    }
                    break;
                case "size" :
                    sb.append(count).append("\n");
                    break;
                case "empty" :
                    if (count == 0) {
                        sb.append("1 \n");
                    } else {
                        sb.append("0 \n");
                    }
                    break;
                case "front" :
                    if(count == 0) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(deque.peekFirst()).append(" \n");
                    }
                    break;
                case "back" :
                    if(count == 0) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(deque.peekLast()).append(" \n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}

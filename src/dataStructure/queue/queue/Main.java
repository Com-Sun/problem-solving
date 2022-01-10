package dataStructure.queue.queue;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int end = 0;

        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "push":
                    end = Integer.parseInt(st.nextToken());
                    queue.offer(end);
                    break;
                case "pop" :
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if (queue.isEmpty()) {
                        sb.append("1").append("\n");
                        break;
                    }
                    sb.append("0").append("\n");
                    break;
                case "front" :
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(queue.peek()).append("\n");
                    break;
                case "back" :
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(end).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
package dataStructure.queue.요세푸스;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i = 1; i <= n; i ++) {
            queue.offer(i);
        }

        for(int i = 0; i < n-1; i ++) {
            for(int j = 0; j < k-1; j ++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }

        sb.append(queue.poll() + ">");

        System.out.println(sb);

    }
}

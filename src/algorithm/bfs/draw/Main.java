package algorithm.bfs.draw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] board = new int[502][502];
        boolean[][] visit = new boolean[502][502];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<Pair> queue = new LinkedList<>();
        visit[0][0] = true;
        queue.add(new Pair(0,0));
        while (!queue.isEmpty()) {
            Pair cur = queue.peek();
            queue.poll();
        }
    }
}

class Pair {
    private int x;
    private int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
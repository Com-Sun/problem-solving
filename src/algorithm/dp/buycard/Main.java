package algorithm.dp.buycard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[10005];
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        int[] d = new int[1005];
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j<= i; j ++) {
                if (d[i] < d[i-j] + p[j]) {
                    d[i] = d[i-j] + p[j];
                }
            }
        }

        System.out.println(d[n]);
    }
}

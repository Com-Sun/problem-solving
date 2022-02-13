package algorithm.dp.stairs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] d = new int[302];
        int[] s = new int[302];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            s[i] = sc.nextInt();
            total += s[i];
        }
//        if (n <= 2) {
//            System.out.println(total);
//            return;
//        }
        d[1] = s[1];
        d[2] = s[2];
        d[3] = s[3];
        for (int i = 4; i < n; i++) {
            d[i] = Math.min(d[i-2], d[i-3]) + s[i];
        }
        System.out.println(total - Math.min(d[n-1],d[n-2]));
    }
}

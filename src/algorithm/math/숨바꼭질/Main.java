package algorithm.math.숨바꼭질;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if (n == 1) {
            int a = sc.nextInt();
            System.out.println(Math.abs(s - a));
        } else {
            int[] aArr = new int[n];
            aArr[0] = sc.nextInt();
            int ans = Math.abs(s - aArr[0]);
            for (int i = 1; i < n; i++) {
                aArr[i] = sc.nextInt();
                ans = gcd(ans, Math.abs(s - aArr[i]));
            }
            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}


/*
n = 1일 경우
|s - a|

n = 2일 경우

|s - a1|, |s - a2|의 최대공약수

 */
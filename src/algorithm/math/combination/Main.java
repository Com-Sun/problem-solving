package algorithm.math.combination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long five = 0;
        long two = 0;

        for (long i = 5; i <= n; i = i * 5) {
            five += n / i;
        }
        for (long i = 5; i <= m; i = i * 5) {
            five -= m / i;
        }
        for (long i = 5; i <= n - m; i = i * 5) {
            five -= (n - m) / i;
        }
        // 5의 갯수를 찾는 경우

        for (long i = 2; i <= n; i = i * 2) {
            two += n / i;
        }
        for (long i = 2; i <= n; i = i * 2) {
            two -= m / i;
        }
        for (long i = 2; i <= n; i = i * 2) {
            two -= (n - m) / i;
        }
        //2의 갯수를 찾는 경우
        System.out.println(Math.min(five, two));
    }
}


/*
조합: nCr = n! / r!(n-r)!
조합의 끝자리 0의 갯수는?

n!의 0의 갯수 - r!의 0의 갯수 - (n-r)!의 0의 갯수
0의 갯수: 그냥 팩토리얼 연산의 경우 5의 갯수였지만 조합의 경우 2 or 5의 갯수를 구한다.
문제: n의 0의 갯수 - r!의 0의 갯수 - (n-r)!의 0의 갯수
 */
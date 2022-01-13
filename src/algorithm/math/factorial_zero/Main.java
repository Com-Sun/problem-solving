package algorithm.math.factorial_zero;

import java.util.Scanner;

public class Main {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(five(n));
        }
    }

    public static int five(int a) {
        if (a == 0) {
            return ans;
        } else if (a % 5 != 0 && a < 5) {
            return ans;
        } else {
            ans += a / 5;
            return five(a / 5);
        }
    }
}

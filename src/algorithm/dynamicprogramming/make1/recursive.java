package algorithm.dynamicprogramming.make1;

import java.util.Scanner;

public class recursive {
    public static int [] ans;
    static int makeOne(int n){
        if (n == 1) {
            return 0;
        }
        if (ans[n] > 0) {
            return ans[n];
        }
        ans[n] = makeOne(n-1) + 1;
        if (n % 2 == 0) {
            int temp = makeOne(n/2) + 1;
            ans[n] = Math.min(ans[n], temp);
        }
        if (n % 3 == 0) {
            int temp = makeOne(n/3) + 1;
            ans[n] = Math.min(ans[n], temp);
        }
        return ans[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans = new int[n+1];
        System.out.println(makeOne(n));
    }
}

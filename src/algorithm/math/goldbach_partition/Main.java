package algorithm.math.goldbach_partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= 1000000; i++) {
            if (!isPrime[i]) {
                continue;
            }
            prime.add(i);
            for (int j = i * 2; j <= 1000000; j += i) {
                isPrime[j] = false;
            }
        }// end Eratosthenes

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int p : prime) {
                if (n - p >= 2 && p <= n-p) {
                    if(isPrime[n-p]) {
                        ans ++;
                    }
                } else {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}

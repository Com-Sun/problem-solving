package algorithm.math.prime_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(str[i]);
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (prime(intArr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean prime(int a) {
        if (a <= 1) {
            return false;
        } else if (a == 2) {
            return true;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

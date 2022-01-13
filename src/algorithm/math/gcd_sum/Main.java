package algorithm.math.gcd_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long ans = 0;
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int[] intArr = new int[n];
            for (int j = 0; j < n; j++) {
                intArr[j] = Integer.parseInt(str[j + 1]);
            }//여기까지 str배열을 int로
            for (int k = 0; k < n - 1; k++) {
                for (int l = k + 1; l < n; l++) {
                    ans += gcd(intArr[k], intArr[l]);
                }
            }
            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }
    }
}

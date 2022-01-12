package algorithm.math.lcm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; i ++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int lcm = a*b/gcd(a,b);
            bw.write(lcm + "\n");
        }
        bw.flush();
        bw.close();

    }

    public static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}

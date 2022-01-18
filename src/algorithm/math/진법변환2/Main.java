package algorithm.math.진법변환2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        int b = (s.charAt(0) - '0');
        if (b < 2) {
            sb.append(b);
        } else if (b >= 2 && b < 4) {
            sb.append(b/2);
            b%=2;
            sb.append(b%2);
        } else {
            sb.append(b/4);
            b%=4;
            sb.append(b/2);
            b%=2;
            sb.append(b%2);
        }

        for(int i = 1; i < n; i++) {
            int a = (s.charAt(i) - '0');
            if (a < 2) {
                sb.append(0);
                sb.append(0);
                sb.append(a);
            } else if (a < 4) {
                sb.append(0);
                sb.append(a/2);
                a%=2;
                sb.append(a%2);
            } else {
                sb.append(a/4);
                a%=4;
                sb.append(a/2);
                a%=2;
                sb.append(a%2);
            }
        }
        System.out.println(sb);
    }
}

package algorithm.math.진법변환;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (n % 3 == 1) {
            bw.write((s.charAt(0) - '0')+"");
        } else if (n % 3 == 2) {
            bw.write((s.charAt(0) - '0') * 2 + (s.charAt(1) - '0')+"");
        }
        for (int i = n % 3; i < n; i += 3) {
            bw.write((s.charAt(i) - '0') * 4 + (s.charAt(i+1) - '0') * 2 + (s.charAt(i+2) - '0')+"");
        }
        bw.flush();
        bw.close();
    }
}

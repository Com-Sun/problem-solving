package algorithm.math.진법변환;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 4;
        char b = (char) a;
        System.out.println(b);
        System.out.println(a);

        bw.write(1 + "");
        bw.write(b + " ");
        bw.flush();
        bw.close();
    }
}

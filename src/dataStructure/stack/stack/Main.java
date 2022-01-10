package dataStructure.stack.stack;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int[] stack = new int[n];
        int size = 0;
        while (n-- > 0) {
            String cmd = sc.next();
            if(cmd.equals("push")) {
                int num = Integer.parseInt(sc.next());
                stack [size++] = num;
            }
            if(cmd.equals("top")) {
                if(size == 0) {
                    bw.write("-1\n");
                }

                if(size != 0) {
                    bw.write(stack[size-1]  + "\n");
                }
            }
            if(cmd.equals("size")) {
                bw.write(size+"\n");
            }
            if(cmd.equals("empty")) {
                if(size==0) {
                    bw.write("1\n");
                }
                if(size!=0) {
                    bw.write("0\n");
                }
            }
            if(cmd.equals("pop")) {
                if(size == 0) {
                    bw.write("-1\n");
                }
                if(size != 0) {
                    bw.write(stack[size-1] + "\n");
                    size-= 1;
                }
            }
        }
        bw.flush();
    }
}
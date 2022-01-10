package dataStructure.stack.단어뒤집기;

import java.util.*;
import java.io.*;

public class Main {
    static Stack<Character> s = new Stack<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine() + "\n";
            for(char ch : str.toCharArray()) {
                stack(ch);
            }
            bw.flush();
        }
    }

    public static void stack (char ch) throws IOException {
        if (ch == '\n' || ch == ' ') {
            while(!s.isEmpty()) {
                bw.write(s.pop());
            }
            bw.write(ch);
        } else {
            s.push(ch);
        }
        bw.flush();
    }
}
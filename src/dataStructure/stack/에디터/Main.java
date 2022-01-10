package dataStructure.stack.에디터;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int m = Integer.parseInt(br.readLine());
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            left.push(s.charAt(i));
        }

        while(m-- > 0) {
            String[] sArr = br.readLine().split(" ");
            char check = sArr[0].charAt(0);
            if (check == 'L') {
                if (!left.empty()) {
                    right.push(left.pop());
                }
            }
            if (check == 'D') {
                if (!right.empty()) {
                    left.push(right.pop());
                }
            }

            if (check == 'B') {
                if (!left.empty()) {
                    left.pop();
                }
            }

            if (check == 'P') {
                left.push(sArr[1].charAt(0));
            }
        }
        StringBuffer sb = new StringBuffer();

        while(!left.empty()) {
            right.push(left.pop());
        }

        while(!right.empty()){
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}

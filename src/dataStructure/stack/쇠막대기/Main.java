package dataStructure.stack.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iron = sc.nextLine();
        Stack<Integer> stack = new Stack<Integer>();
        int ans = 0;

        char[] charArr = iron.toCharArray();
        for(int i = 0; i < charArr.length; i ++) {
            char ch = iron.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                if (stack.peek() + 1 == i) {
                    stack.pop();
                    ans += stack.size();
                } else {
                    stack.pop();
                    ans++;
                }
            }
        }

        System.out.print(ans);
    }
}

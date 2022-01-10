package dataStructure.stack.괄호;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            System.out.println(isValid(sc.next()));
        }
    }

    public static String isValid(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i< n; i ++) {
            if(s.charAt(i)=='(') {
                count+=1;
            }
            if (s.charAt(i) == ')') {
                count -=1;
            }
            if(count < 0) {
                return "NO";
            }
        }

        if (count == 0) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}

package dataStructure.stack.단어뒤집기2;

import java.io.*;
import java.util.*;

public class Main {
    public static void print (BufferedWriter bw, Stack<Character> s) throws IOException{
        while(!s.isEmpty()){
            bw.write(s.pop());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> s = new Stack<Character>();
        boolean tag = false;

        for(char ch : str.toCharArray()) {

            if (ch == '<'){
                print (bw, s);
                bw.write(ch);
                tag = true;

            }

            else if (ch == '>') {
                bw.write(ch);
                tag = false;
            }

            else if (tag) {
                bw.write(ch);
            }

            else {
                if (ch == ' ') {
                    print(bw, s);
                    bw.write(' ');
                }

                else {
                    s.push(ch);
                }
            }
        }

        print(bw, s);
        bw.flush();
        bw.close();
    }
}
# 단어 뒤집기2

## 문제

문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.

먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.

1. 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
2. 문자열의 시작과 끝은 공백이 아니다.
3. '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.

태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

## 입력

첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.

## 출력

첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.

---

## 코드

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


## 풀이

단어뒤집기 - 스택 자료구조를 사용하면 편하다는것을 생각하자. 풀이 과정은 다음과 같다.

1. BufferedReader 객체 br 생성한 뒤, String으로 초기화
2. 읽은 br 객체를 for - each문으로 반복. 이 때 String객체는 char배열로 바꿔준다.
3. 모든 경우의수를 나눈다. '<', '>' 의 경우를 먼저 생각하고, 다음으로 태그일 경우, 마지막으로 태그가 아닐 경우를 생각.
4. 코드 작성은 위의 역순으로 한다. 우선 태그 바깥에서 공백을 만나면 print 한다. 그리고 공백을 bw객체에 쓴다.
5. 태그 바깥에서 공백이 아닐경우 스택 자료구조에 char를 넣는다.
6. 다음으로 태그일 경우 ch를 bw객체에 쓴다.
7. 다음으로 '>'를 만나는 경우 태그의 끝이므로 tag = false를 한 뒤, bw객체에 '>'를 쓴다.
8. 마지막으로 '<'를 만나는 경우 이전까지의 char을 print하고 '<'를 넣어준다. 태그를 true로 바꿔준다.
9. for-each문이 끝난 뒤 남아있는 문자를 print 해주고 flush한다.
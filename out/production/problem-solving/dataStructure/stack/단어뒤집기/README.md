# 단어 뒤집기 - 9093

## 문제

문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

## 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.

## 출력

각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.

풀이방법 : 스택 자료구조를 이용한다.

시간복잡도 : O(n)

---

## 풀면서 느낀 의문점

1. 강의에서 제시한 소스코드 말고, indent depth를 2 이하로 하면서 풀면 어떨까

2. 자바에서 Stack 자료구조의 사용법

## 내가 찾은 해답

1. 밑의 코드참조

2.

![](/img/stackAPI.PNG)

우선 Stack 클래스의 자료구조는 위와 같다.

5개의 메소드가 존재한다.

1. boolean empty()

2. E peek()

3. E pop ()

4. E push(E item)

5. int search(Object o)

여기서 E가 무엇을 의미하는지 몰라 찾아보니 제네릭이라고한다.
## 코드

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

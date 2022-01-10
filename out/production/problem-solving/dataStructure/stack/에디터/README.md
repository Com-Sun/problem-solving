# 에디터 - 1406

![](./img/에디터.PNG)
![](./img/에디터2.PNG)

---

풀이방법 :

1. StringBuffer 사용

2. Stack 자료구조 이용

3. linkedList 사용

시간복잡도 :

1. StringBuffer의 경우 O(n^2)

2. Stack 자료구조의 경우 : O(n)

3. LinkedList의 경우 : 아직 모름

## 풀면서 느낀 것

알고리즘 문제를 풀며 자바의 사용법에 익숙해져가는 중이다. 스택자료구조의 사용 말고 LinkedList를 사용하는 법을 통해 문제를 해결해봐야겠다.

## 코드

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

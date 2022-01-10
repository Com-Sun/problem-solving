# 스택 - 10828

## 문제

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

- push X: 정수 X를 스택에 넣는 연산이다.
- pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- size: 스택에 들어있는 정수의 개수를 출력한다.
- empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
- top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

## 입력

첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

## 출력

출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

## 풀면서 느낀 의문점

1. BufferedWriter 사용법 (왜 IOException이 발생하는가?)

2. stack [size++] = num; (배열의 크기보다 1 큰데 어떻게 대입이 가능한지?)


## 내가 찾은 해답

1번 : [입출력](https://github.com/Com-Sun/today-i-learned/blob/main/Back-End/studyJava/%EA%B0%9C%EB%85%90/%EC%9E%85%EC%B6%9C%EB%A0%A5.md) 문서에 정리해두었다.

2번 : 코드를 제대로 이해하지 못해서 생겨난 의문이었다. size의 값은 0이었다. 즉, push를 하면 스택 자료구조 인덱스의 size++ 번째에 새로운 정수를 넣는다.


## 코드

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
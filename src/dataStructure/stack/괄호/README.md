# 괄호 - 9012

## 문제

괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.

여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 

## 입력

입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 

## 출력

출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 

---

풀이방법 :

1. 스택 자료구조를 이용한다.

2. ')'를 만났을 때 입력값의 처음으로 돌아가 맞는 '(' 쌍을 찾는다.

시간복잡도 :

1번의 경우 : O(n)

2번의 경우 : O(n^2)

## 풀면서 느낀 점

우선 나의 경우 스택자료구조를 이용해 문제를 풀어보았다. Stack 클래스를 선언하고, Push, pop을 사용해서 풀어봤는데 백준의 소스를 보니 훨씬 간단하게 풀 수 있었다.

똑같이 스택 자료구조를 사용하는데 Stack클래스를 사용하지 않고도 풀리는 것을 보고 어떻게 이렇게 되는지 생각을 해 보았다.

이전의 문제 : 문자열 전체를 출력

이 문제 : 맞는지 아닌지 "판단만" 하여 "Yes", "No"만 출력

즉, 같은 자료구조를 사용하더라도 어떤 문제는 Stack 자료형을 사용해야하고, 이번같이 **판단**만하는 문제는 개념만 사용하여 해결할 수 있다.

## 코드

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
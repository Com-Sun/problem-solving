package dataStructure.stack.오등큰수;

import java.io.*;
import java.util.*;

/*
크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오등큰수 NGF(i)를 구하려고 한다.

Ai가 수열 A에서 등장한 횟수를 F(Ai)라고 했을 때, Ai의 오등큰수는 오른쪽에 있으면서 수열 A에서 등장한 횟수가 F(Ai)보다 큰 수 중에서 가장 왼쪽에
있는 수를 의미한다. 그러한 수가 없는 경우에 오등큰수는 -1이다.

예를 들어, A = [1, 1, 2, 3, 4, 2, 1]인 경우 F(1) = 3, F(2) = 2, F(3) = 1, F(4) = 1이다.
A1의 오른쪽에 있으면서 등장한 횟수가 3보다 큰 수는 없기 때문에, NGF(1) = -1이다.
A3의 경우에는 A7이 오른쪽에 있으면서 F(A3=2) < F(A7=1) 이기 때문에, NGF(3) = 1이다. NGF(4) = 2, NGF(5) = 2, NGF(6) = 1 이다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        String[] temp = br.readLine().split(" ");
        int[] a = new int[n];
        int[] freq = new int[1000001];
        int[] ngf = new int[n];
        for(int i =0; i < n; i++) {
            a[i] = Integer.parseInt(temp[i]);
            freq[a[i]]++;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while(!stack.isEmpty() && freq[a[i-1]] < freq[a[i]]) {
                if (freq[a[stack.peek()]] < freq[a[i]]) {
                    ngf[stack.pop()] = a[i];
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ngf[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i ++) {
            bw.write(ngf[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}


/*
시간복잡도 : O(n)
수열 a[]
빈도수 freq[]
스택 stack
정답 ngf[]

1. 수열의 각 원소가 나온 갯수를 샌다.

[1, 1, 2, 3, 4, 2, 1]

for (int i = 0; i < n; i++) {
    freq[a[i]]++;
}

freq[] = [3, 2, 1, 1]


2.

스택: 인덱스가 들어가야함
stack.push(0)
stack = [0]
a[] = [1, 1, 2, 3, 4, 2, 1]
freq[] = [3, 2, 1, 1]
ngf[] = []

for (int i = 1; i < n; i++) {
    while(!stack.isEmpty() && freq[a[i-1]] < freq[a[i]] {
        ngf[stack.peek] = a[stack.pop()];
    }
    stack.push(i)
}

3.

stack = [0, 1]
a[] = [1, 1, 2,/ 3, 4, 2, 1]
freq[] = [3, 2, 1, 1]
ngf[] = []

4.

stack = [0, 1, 2]
a[] = [1, 1, 2, 3,/ 4, 2, 1]
freq[] = [3, 2, 1, 1]
ngf[] = []

5.

stack = [0, 1, 2, 3]
a[] = [1, 1, 2, 3, 4,/ 2, 1]
freq[] = [3, 2, 1, 1]
ngf[] = []

6.

stack = [0, 1, 2, 3, 4]
a[] = [1, 1, 2, 3, 4, 2, 1]
freq[] = [3, 2, 1, 1]
ngf[] = []


 */
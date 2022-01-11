package dataStructure.stack.오큰수;

import java.io.*;
import java.util.*;


/*
크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.

예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nge = new int[n];
        int[] a = new int[n];
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(temp[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i < n; i ++){
            while(!stack.isEmpty() && a[stack.peek()] < a[i]) {
                nge[stack.pop()] = a[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            nge[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i ++) {
            bw.write(nge[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}

/*
a[] = [3, 5, 2, 7]
stack = [0]

nge[] = [] - if (stack == isEmpty()) = stack.push(i)
스택이 비었으면 'i'를 스택에 넣는다. 스택의 존재 이유는 a수열의 index를 저장하기 위함이다.

a[] = [3, 5, 2, 7]
stack = []
nge[] = [5]

while (!stack.isEmpty() && a[stack.peek() < a[i] ) {
    nge[stack.pop] = a[i]
}

여기가 매우 중요하다. 스택에 수가 있을 경우 && 스택의 맨 위의 수가 a[i]보다 작을 경우 nge pop에 a[i]를 대입한다. 왼쪽에 있는 수가 더  크면 대입하지 않는다.


stack.push(i)

a[] = [3, 5, 2, 7]
stack = [0, 1, 2]
nge[] = [5, ] -무시하고

a[] = [3, 5, 2, 7]
stack = []
nge[] = [5, 7, 7] - 자기보다 큰 수를 만날 경우사이에 있는 모든 수가 스택에 있는 수로 바뀜

a[] = [3, 5, 2, 7]
stack = [7]
nge[] = [5, 7, 7, -1]

1.



[0,]
[5]

[1, 2, ]


 */

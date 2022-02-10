package algorithm.dp.stairs;

import java.util.Scanner;

/*
### 2. 점화식

- j가 1일 경우
  - D[k][1] = max(D[k-2][1], D[k-2][2]) + S[k]
- j가 2일 경우
  - D[k][2] = D[k-1][1] + S[k]

### 3. 초기값

- D[1][1] = S[1]
- D[1][2] = 0
- D[2][1] = S[2]
- D[2][2] = S[1] + S[2]
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int [301];
        for (int i = 1; i <= n; i ++) {
            s[i] = sc.nextInt();
        }
        int[][] d = new int [301][3];
        d[1][1] = s[1];
        d[1][2] = 0;
        d[2][1] = s[2];
        d[2][2] = s[1] + s[2];
        for(int i = 3; i <= n; i++) {
            d[i][1] = Math.max(d[i-2][1], d[i-2][2]) + s[i];
            d[i][2] = d[i-1][1] + s[i];
        }
        System.out.println(Math.max(d[n][1], d[n][2]));
    }
}

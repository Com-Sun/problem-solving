package algorithm.dp.sumsection;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] strNum = br.readLine().split(" ");
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(strNum[i - 1]);
        }
        int[] d = new int[n + 1];
        d[1] = a[1];
        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + a[i];
        }
        for (int j = 0; j < m; j++) {
            String[] ij = br.readLine().split(" ");
            int k = Integer.parseInt(ij[0]);
            int l = Integer.parseInt(ij[1]);
            bw.write(d[l] - d[k-1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}

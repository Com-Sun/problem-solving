package algorithm.sorting.shell.sortingnum2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : list) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

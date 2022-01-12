package algorithm.math.goldbach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> primeNum = new ArrayList<>();
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!isPrime[i]) {
                continue;
            }
            primeNum.add(i);
            for (int j = 2 * i; j <= 1000000; j += i) {
                isPrime[j] = false;
            }
        }// end Eratosthenes
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }
            for (int p : primeNum) {
                if (isPrime[n - p]) {
                    System.out.println(n + " = " + p + " + " + (n - p));
                    break;
                }
            }
        }
    }
}


/*
n = a + b, 3이상
if (n - a) == isPrime
출력

1. 1,000,000 이하의 모든 소수 구하기
2. 입력받은 n - 소수 = 소수이면 출력하는 로직 만들기

 */
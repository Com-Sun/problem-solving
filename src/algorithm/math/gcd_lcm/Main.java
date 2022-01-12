package algorithm.math.gcd_lcm;

/*
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a,b);
        int lcm = a*b/gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }

    public static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd (b, a%b);
        }
    }
    //최대공약수를 return하는 함수 gcd
}



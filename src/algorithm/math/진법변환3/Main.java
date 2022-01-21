package algorithm.math.진법변환3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else {
            change(n);
        }

    }

    public static void change(int n) {
        if (n == 0) {
            return;
        } else if (n % 2 == 0) {
            change(-(n / 2));
            System.out.print(0);
        } else {
            if (n > 0) {
                change(-(n / 2));
            } else {
                change((-n + 1) / 2);
            }
            System.out.print(1);
        }

    }
}
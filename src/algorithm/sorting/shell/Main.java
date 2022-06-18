package algorithm.sorting.shell;

import algorithm.sorting.insertion.Insertion4;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 23, 346, 6, 2, 4234, 52346, 6275, 3, 5, 4462, 75, 24, 875, 7, 863};
        for (int i : arr) {
            System.out.println("i = " + i);
        }

        System.out.println("---------------------");

        Shell.sort(arr);

        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
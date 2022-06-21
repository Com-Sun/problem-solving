package algorithm.sorting.shell;

import algorithm.sorting.insertion.Insertion4;
import algorithm.sorting.utils.Source;

public class Main {

    public static void main(String[] args) {
        int[] arr = Source.generateArr();
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------");

        Shell3.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

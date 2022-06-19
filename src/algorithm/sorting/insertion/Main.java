package algorithm.sorting.insertion;

import algorithm.sorting.selection.Selection3;
import algorithm.sorting.shell.Shell;
import algorithm.sorting.utils.Source;

public class Main {
    public static void main(String[] args) {
        int[] arr = Source.generateArr();
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------");

        Insertion5.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
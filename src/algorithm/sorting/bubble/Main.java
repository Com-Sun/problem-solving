package algorithm.sorting.bubble;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 23, 346, 6, 2, 4234, 52346, 6275, 3, 5, 4462, 75, 24, 875, 7, 863};
        for (int i : arr) {
            System.out.println("i = " + i);
        }

        Bubble3.sort(arr);
        System.out.println("============================");
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}

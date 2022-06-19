package algorithm.sorting.utils;

import java.util.HashSet;
import java.util.Set;

/**
 * Generate random soruce.
 *
 * @return int[] arr
 */
public class Source {

    public static int[] generateArr() {
        Set<Integer> soruces = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            soruces.add((int) (Math.random() * 10000));
        }

        return soruces.stream().mapToInt(Number::intValue).toArray();
    }
}

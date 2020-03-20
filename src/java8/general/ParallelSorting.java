package java8.general;

import java.util.Arrays;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class ParallelSorting {
    public static void main(String[] args) {
        int[] ints = new int[10000000];
        for (int i = 0; i < ints.length; ++i) {
            ints[i] = (int)(Math.random() * 10000000);
        }
        int[] copy = ints.clone();
        long start, end;
        
        // Previous to Java 8.
        start = System.currentTimeMillis();
        Arrays.sort(ints);
        end = System.currentTimeMillis();
        System.out.println(end - start);

        // Since Java 8.
        start = System.currentTimeMillis();
        Arrays.parallelSort(copy);
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

/****************
 * Output:      *
 * 1346         *
 * 496          *
 ****************/


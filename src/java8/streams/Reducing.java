package java8.streams;

import java.util.stream.Stream;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class Reducing {

    public static void main(String[] args) {
        // Stream.
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

        // Sum of values.
        int sum = s.reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

/****************
 * Output:      *
 * 15           *
 ****************/


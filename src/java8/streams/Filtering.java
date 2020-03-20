package java8.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class Filtering {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(0, 1, 2, 3, 4, 5);
        Predicate<Integer> p = i -> i % 2 == 0;
        s = s.filter(p);
        s.forEach(System.out::print);
    }
}

/****************
 * Output:      *
 * 024          *
 ****************/
 
 
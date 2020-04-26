package java8.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class AverageWithStreams {
    public static void main(String[] args) {
        // Say we want calculate the average of an array with Streams.
        Double[] array = {1.1, 2.2, 4.4, 5.5};

        // Streams are closed after executing one operation on them,
        // but for an average we need two operations. One to sum up
        // the elements and one to count the elements. Hence, we
        // use a Supplier to create Streams when we need it.
        Supplier<Stream<Double>> supplier = () -> Stream.of(array);

        // Sum using reduction.
        double sum = supplier.get().reduce(0.0, Double::sum);
        // Count using the count method.
        double count = supplier.get().count();

        double avg = sum / count;

        System.out.println(avg); /** Output: 3.3 */
    }
}


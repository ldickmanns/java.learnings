package java8.optionals;

import java.util.Optional;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class CheckingPresence {
    public static void main(String[] args) {
        // Create an Optional.
        Optional<Double> numerator = Optional.of(3.0);
        // Create an empty Optional - the value is null.
        Optional<Double> denominator = Optional.empty();

        // Retrieving the value or using a default value (1.0).
        double n;
        if (numerator.isPresent())
            n = numerator.get();
        else
            n = 1.0;

        // Same as above but in short.
        double d = denominator.orElse(1.0);

        System.out.println(n / d);
    }
}

/************
 * Output:  *
 * 3.0      *
 ************/


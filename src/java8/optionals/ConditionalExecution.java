package java8.optionals;

import java.util.Optional;
import java.util.function.Consumer;

import static java.util.Optional.of;
import static java.util.Optional.empty;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class ConditionalExecution {
    public static void main(String[] args) {
        Optional<String> o1 = of("Stay Healthy");
        Optional<String> o2 = empty();

        Consumer<String> action = System.out::print;;
        Runnable emptyAction = () -> System.out.print("!");

        o1.ifPresent(action);
        o2.ifPresentOrElse(action, emptyAction);
    }
}

/********************
 * Output:          *
 * Stay Healthy!    *
 ********************/


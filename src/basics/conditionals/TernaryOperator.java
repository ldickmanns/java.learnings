package basics.conditionals;

import java.util.Random;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class TernaryOperator {
    public static void main(String[] args) {
        int i = new Random().nextInt();

        String s1 = "The variable i is ";
        if (i >= 0) {
            s1 += "positive.";
        } else {
            s1 += "negative.";
        }
        System.out.println(s1);

        // The code above can be made way shorter!
        String s2 = "The variable i is ";
        s2 += i >= 0 ? "positive." : "negative.";
        System.out.println(s2);

        /** Both print the same String. */
    }
}


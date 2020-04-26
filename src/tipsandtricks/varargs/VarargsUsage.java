package tipsandtricks.varargs;

import java.util.Arrays;

/** Static imports to use static methods without the class name. */
import static tipsandtricks.varargs.VarargsCalculator.addNumbers;
import static tipsandtricks.varargs.VarargsCalculator.increaseNumbersByValue;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class VarargsUsage {
    public static void main(String[] args) {
        /** Standard usage of varargs. */
        int[] ints = increaseNumbersByValue(1, 3, 2, 5, 3);
        System.out.println(Arrays.toString(ints));
        /** Output: [4, 3, 6, 4] */

        /** You can use an array as varargs. (see below) */
        int sum = addNumbers(ints);
        System.out.println(sum);
        /** Output: 17 */
    }
}


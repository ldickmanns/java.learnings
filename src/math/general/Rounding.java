package math.general;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class Rounding {
    public static void main(String[] args) {
        double d = 1.5;

        double floor = Math.floor(d);
        double ceil = Math.ceil(d);
        double round = Math.round(d);

        System.out.println(floor);  /** 1.0 */
        System.out.println(ceil);   /** 2.0 */
        System.out.println(round);  /** 2.0 */
    }
}


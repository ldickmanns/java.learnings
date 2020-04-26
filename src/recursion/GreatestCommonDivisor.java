package recursion;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 55;
        int b = 10;
        int result = gcd(a, b);
        System.out.println(result);
    }

    /** Recursive greatest common divisor. */
    static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a > b) return gcd(a-b, b);
        else return gcd(a, b-a);
    }
}

/****************
 * Output:      *
 * 5            *
 ****************/


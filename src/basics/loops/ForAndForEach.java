package basics.loops;

/********************
 * Java Learnings  	*
 * @java.learnings	*
 ********************/

public class ForAndForEach {
    public static void main(String[] args) {
        String[] s = {"Coding ", "is ", "awesome!"};
        // for loop:
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toUpperCase();
        }

        // foreach or enhanced for loop:
        for (String string : s) {
            System.out.print(string);
        } /** Output: CODING IS AWESOME! */
    }
}


package java8.general;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class ConstructorReference {
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o', '!'};

        Stringify stringify = String::new;

        String string = stringify.fromChars(chars);
        System.out.println(string);
    }
}

interface Stringify {
    String fromChars(char[] chars);
}

/****************
 * Output:      *
 * Hello!       *
 ****************/


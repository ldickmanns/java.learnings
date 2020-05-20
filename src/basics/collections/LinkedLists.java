package basics.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3));
        int number = list.get(1);           // Access by index
        System.out.println(list.get(1));    /** Output: 2 */
        list.addAll(list);                  // Adding a collection to the list
        int size = list.size();             // Size of the list
        System.out.println(size);           /** Output: 6 */
        list.remove(3);               // Delete by index
        boolean b = list.contains(1);       // Check if a 1 is in the list
        System.out.println(b);              /** Output: true */
        b = list.isEmpty();                 // Check if the list is empty
        System.out.println(b);              /** Output: false */

        for (int i : list) {
            System.out.print(i);
        } /** Output: 12323 */

        // Fancy Java 8 static method reference for-each loop
        // Does the same as the for-each above, but is shorter
        list.forEach(System.out::print);    /** Output: 12323 */
    }
}


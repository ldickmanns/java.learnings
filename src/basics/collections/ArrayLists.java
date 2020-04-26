package basics.collections;

import java.util.ArrayList;
import java.util.List;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class ArrayLists {
    public static void main(String[] args) {
        // Creating a new list
        List<Integer> list = new ArrayList<>();
        list.add(4);                    // Adds 4 to the list
        list.add(2);                    // Adds 2 to the list
        int number = list.get(1);       // Access by index
        System.out.println(number);     /** Output: 2 */
        list.addAll(list);              // Adds a collection to the list
        int size = list.size();         // Size of the list
        System.out.println(size);       /** Output: 4 */
        list.remove(3);           // Delete by index
        boolean b = list.contains(4);   // Check if a 4 is in the list
        System.out.println(b);          /** Output: true */
        b = list.isEmpty();             // Check if the list is empty
        System.out.println(b);          /** Output: false */

        // For-each loop to iterate over the list
        for (int i : list) {
            System.out.print(i);
        } /** Output: 424 */

        // Fancy Java 8 static method reference for-each loop
        // Does the same as the for-each above, but is shorter
        list.forEach(System.out::print); /** Output: 424 */
    }
}


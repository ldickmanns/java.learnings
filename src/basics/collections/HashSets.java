package basics.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello ");           // Adding an element
        boolean b = hashSet.isEmpty();  // Check if the set is empty
        System.out.println(b);          /** Output: false */
        List<String> list = Arrays.asList("fellow ", "Devs!", "test");
        hashSet.addAll(list);           // Adding a collection to the set
        int size = hashSet.size();      // Size of the set
        System.out.println(size);       /** Output: 4 */
        hashSet.remove("test");      // Deleting an element
        b = hashSet.contains("Devs!");  // Check if an element is in the set
        System.out.println(b);          /** Output: true */

        // For-each loop to iterate over the set
        for (String s : hashSet) {
            System.out.print(s);
        } /** Output: Hello fellow Devs! */

        // Same as above in short
        hashSet.forEach(System.out::print); /** Output: Hello fellow Devs! */
    }
}


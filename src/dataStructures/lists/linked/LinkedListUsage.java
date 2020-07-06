package dataStructures.lists.linked;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(3)); /** Output: 4 */
        list.remove(3);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i));
        } /** Output: 124 */
        list.add(5);
    }
}


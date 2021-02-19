package dataStructures.trees.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InOrder {
    /** This traverses the tree in in-order */
    static List<Integer> inOrder(Node node) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(inOrder(node.left));
        list.add(node.data);
        list.addAll(inOrder(node.right));
        return list;
    }

    public static void main(String[] args) {
        Node root = Node.buildTree();

        /** Finally, this prints the output */
        List<Integer> result = inOrder(root);
        for (int i : result) {
            System.out.print(i);
        } /** Output: 1234567 */

        result.forEach(System.out::print);
        /** Output: 1234567 */
    }
}

/********************
 * In-Order         *
 * Tree             *
 * Traversal        *
 ********************
 * @java.learnings  *
 ********************/


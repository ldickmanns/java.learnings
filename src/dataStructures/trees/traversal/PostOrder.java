package dataStructures.trees.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostOrder {
    /** This traverses the tree in post-order */
    static List<Integer> postOrder(Node node) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(postOrder(node.left));
        list.addAll(postOrder(node.right));
        list.add(node.data);
        return list;
    }

    public static void main(String[] args) {
        Node root = Node.buildTree();

        /** Finally, this prints the output */
        List<Integer> result = postOrder(root);
        for (int i : result) {
            System.out.print(i);
        } /** Output: 1325764 */

        result.forEach(System.out::print);
        /** Output: 1325764 */
    }
}

/********************
 * Post-Order        *
 * Tree             *
 * Traversal        *
 ********************
 * @java.learnings  *
 ********************/


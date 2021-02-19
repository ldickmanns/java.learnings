package dataStructures.trees.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PreOrder {
    /** This traverses the tree in pre-order */
    static List<Integer> preOrder(Node node) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        list.add(node.data);
        list.addAll(preOrder(node.left));
        list.addAll(preOrder(node.right));
        return list;
    }

    public static void main(String[] args) {
        Node root = Node.buildTree();

        /************************
         * This is the result:  *
         ************************
         *           4          *
         *         /   \        *
         *        2     6       *
         *       / \   / \      *
         *      1  3  5  7      *
         ************************/

        /** Finally, this prints the output */
        List<Integer> result = preOrder(root);
        for (int i : result) {
            System.out.print(i);
        } /** Output: 4213657 */

        result.forEach(System.out::print);
        /** Output: 4213657 */
    }
}

/********************
 * Preorder         *
 * Tree             *
 * Traversal        *
 ********************
 * @java.learnings  *
 ********************/


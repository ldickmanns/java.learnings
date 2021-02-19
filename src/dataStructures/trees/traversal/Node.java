package dataStructures.trees.traversal;

/** Our tree consists of nodes */
public class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree() {
        /** Let's create a tree */
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        /************************
         * This is the result:  *
         ************************
         *           4          *
         *         /   \        *
         *        2     6       *
         *       / \   / \      *
         *      1  3  5  7      *
         ************************/

        return root;
    }
}

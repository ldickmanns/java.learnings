package dataStructures.trees.binaryTree;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class Node {
    protected Node left, right;
    private final int value;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public int getValue() {
        return value;
    }
}


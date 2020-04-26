package dataStructures.trees;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class BinaryTree {
    public static void main(String[] args) {

    }
}

class Node {
    protected Node left, right;
    private int value;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }
}

/****************
 * Output:      *
 *              *
 ****************/


package dataStructures.trees.binaryTree;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class BinaryTree {
    public static void main(String[] args) {
        Node one = new Node(4, null, null);
        Node three = new Node(3, null, null);
        Node two = new Node(2, one, three);
        Node five = new Node(5, null, null);
        Node seven = new Node(7, null, null);
        Node six = new Node(6, five, seven);
        Node four = new Node(4, two, six);
        System.out.println(four.isLeaf());      /** false */
        System.out.println(seven.isLeaf());     /** true */
        System.out.println(one.getValue());     /** 4 */
    }
}


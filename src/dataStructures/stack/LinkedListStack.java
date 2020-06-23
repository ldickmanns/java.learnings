package dataStructures.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class LinkedListStack<E> {
    private final LinkedList<E> list = new LinkedList<>();

    public void push(E e) {
        list.addLast(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}

class UsageLinkedListStack {
    public static void main(String[] args) {
        LinkedListStack<String> stack = new LinkedListStack<>();
        System.out.println(stack.isEmpty());    /** Output: true */
        stack.push("Devs!");
        stack.push("fellow ");
        stack.push("Hello ");
        System.out.println(stack.isEmpty());    /** Output: false */
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        /** Output: Hello fellow devs! */
    }
}


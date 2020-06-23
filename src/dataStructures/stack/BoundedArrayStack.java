package dataStructures.stack;

import java.util.EmptyStackException;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class BoundedArrayStack<E> {
    private final Object[] array;
    private int pointer = 0;

    public BoundedArrayStack(int size) {
        array = new Object[size];
    }

    public void push(E element) {
        if (pointer == array.length) throw new StackOverflowError();
        array[pointer] = element;
        ++pointer;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        --pointer;
        return (E) array[pointer];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }
}

class UsageBoundedArrayStack {
    public static void main(String[] args) {
        BoundedArrayStack<Integer> stack = new BoundedArrayStack<>(3);
        System.out.println(stack.isEmpty());    /** Output: true */
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.isEmpty());    /** Output: false */
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        /** Output: 123! */
    }
}


package dataStructures.lists.linked;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public void add(T element) {
        Node<T> node = new Node<>(element);
        if (first == null) first = node;
        else last.setNext(node);
        last = node;
        ++size;
    }

    public void remove(T element) {
        if (first.getElement().equals(element)) {
            first = first.getNext();
            --size;
        } else {
            for (Node<T> node = first; node.getNext() != null; node = node.getNext()) {
                Node<T> next = node.getNext();
                if (next.getElement().equals(element)){
                    node.setNext(next.getNext());
                    --size;
                }
            }
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        T result = null;
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            if (i == index) result = node.getElement();
            else node = node.getNext();
        }
        return result;
    }

    public int getSize() {
        return size;
    }
}


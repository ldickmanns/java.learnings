package threads;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class CreatingThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int fi = i;
            Thread t = new Thread(() -> {
                System.out.println("Thread " + fi);
            });
            t.start();
        }
    }
}

/********************************
 * Output:                      *
 * Thread 0-4 in random order   *
 ********************************/


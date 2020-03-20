package threads;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class ThreadCreation {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("Child Thread");
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println("Parent Thread");
	}
}

/*******************
 * Output Options: *
 *******************
 * 1. Option:	   *
 * Child Thread	   *
 * Parent Thread   *
 * 				   *
 * 2. Option:	   *
 * Parent Thread   *
 * Child Thread	   *
 *******************/

package basics.time;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class TimeInMillis {

	public static void main(String[] args) {
		// Start time
		long start = System.currentTimeMillis();
		System.out.println(start + " ms");
		
		for (int i = 0; i < 1000000; i++) {
			// do something
		}
		
		// End time
		long end = System.currentTimeMillis();
		System.out.println(end + " ms");
		
		// Approximated execution time
		long elapsedTime = end - start;
		System.out.println(elapsedTime + " ms");
	}
}

/********************
 * Output:			*
 * 1570719390239 ms	*
 * 1570719390242 ms	*
 * 3 ms				*
 ********************/

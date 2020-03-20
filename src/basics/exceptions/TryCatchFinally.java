package basics.exceptions;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class TryCatchFinally {
	
	public static void main(String[] args) {
		try {
			/** Code to try running. */
		} catch (Exception e) {
			/** Handle occuring exceptions. */
		} finally {
			/** Clean-up.*/
		}
		
		/** Example. */
		try {
			int[] i = {1};
			if(i[0] == 1) return;
			int u = i[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception!");
		} finally {
			System.out.println("Always executed!");
		}
	}
}

/********************
 * Output:			*
 * Always executed!	*
 ********************/

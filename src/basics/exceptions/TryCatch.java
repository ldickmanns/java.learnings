package basics.exceptions;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class TryCatch {

	public static void main(String[] args) {
		try {
			/** 
			 * Run code that can throw an
			 * exception here.
			 */
		} catch (Exception e) {
			/** Handle the exception. */
		}
		
		/** Example. */
		String[] helloWorld = {"Hello ", "World!"};
		try {
			System.out.println(helloWorld[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}

/****************************************************
 * Output:											*
 * java.lang.ArrayIndexOutOfBoundsException: 5		*
 * 		   at com.learnings.java.basics.exceptions.	*
 * 		   TryCatch.main(TryCatch.java:23)			*
 ****************************************************/

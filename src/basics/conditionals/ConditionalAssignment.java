package basics.conditionals;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class ConditionalAssignment {

	public static void main(String[] args) {
		int i = 6;
		
		// if-then-else:
		String message = "i is ";
		if (i < 0) {
			message += "negative";
		} else {
			message += "positive";
		}
		System.out.println(message);
		
		// Conditional Assignment:
		message = "i is ";
		message += i < 0 ? "negative" : "positive";
		System.out.println(message);
	}
}
/********************
 * Output:			*
 * i is positive	*
 * i is positive	*
 *******************/

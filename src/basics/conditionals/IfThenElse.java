package basics.conditionals;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class IfThenElse {

	public static void main(String[] args) {
		boolean condition = true;
		// if-then statement:
		if(condition) {
			System.out.println("Hello Coders!");
		}
		// if-then-else statement:
		condition = false;
		if(condition) {
			System.out.println("This won't be printed!");
		} else {
			System.out.println("Else block is executed!");
		}
		// short if-then statement:
		int i = 1;
		if(i == 1)
			System.out.println("Short if-then!");
	}
}

/****************************
 * Output:					*
 * Hello Coders!			*
 * Else block is executed!	*
 * Short if-then!			*
 ****************************/

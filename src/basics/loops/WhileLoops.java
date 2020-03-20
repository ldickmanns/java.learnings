package basics.loops;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class WhileLoops {

	public static void main(String[] args) {
		int i = 0;
		// while loop
		while(i < 5) {
			System.out.print(i++ + ", ");
		}
		
		// do-while loop
		do {
			System.out.print(i);
		} while (i < 5);
	}
}

/********************
 * Output:			*
 * 0, 1, 2, 3, 4, 5	*
 ********************/

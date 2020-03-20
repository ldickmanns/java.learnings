package basics.loops;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class BreakingAndContinuing {

	public static void main(String[] args) {
		// continuing loop
		System.out.print("Continuing:\t");
		for (int i = 0; i < 5; i++) {
			if (i == 2) continue;
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// breaking loop
		System.out.print("Breaking:\t");
		for (int i = 0; i < 5; i++) {
			if (i == 2) break;
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// breaking nested loop
		System.out.println("Breaking nested:");
		outer:
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 2) break outer;
				System.out.printf("(%d, %d), ", i, j);
			}
		}
	}
}

/****************************************************
 * Output:											*
 * Continuing:	0, 1, 3, 4, 						*
 * Breaking:	0, 1, 								*
 * Breaking nested:									*
 * (0, 0), (0, 1), (0, 2), (1, 0), (1, 1), (1, 2),	*
 ****************************************************/

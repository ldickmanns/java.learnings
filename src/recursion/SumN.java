package recursion;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class SumN {

	public static void main(String[] args) {
		System.out.println(sumN(0));
		System.out.println(sumN(3));
		System.out.println(sumN(5));
	}

	private static int sumN(int n) {
		if(n < 1) return 0;
		return n + sumN(n - 1);
	}
}

/****************
 * Output:		*
 * 0			*
 * 6			*
 * 15			*
 ****************/

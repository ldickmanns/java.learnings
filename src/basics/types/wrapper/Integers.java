package basics.types.wrapper;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Integers {

	public static void main(String[] args) {
		// Primitive int:
		int i = 2147483647;
		// Wrapper class:
		Integer wrapper = new Integer(-2147483648);
		// Functionalities of the Wrapper:
		String s = wrapper.toString();
		int fromString = Integer.parseInt(s);
		int comp = Integer.compare(i, fromString);
		String hex = Integer.toHexString(wrapper);
		
		System.out.println(comp);
		System.out.println(hex);
	}
}

/************
 * Output:	*
 * 1		*
 * 80000000	*
 ************/

package basics.strings;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Strings {

	public static void main(String[] args) {
		String s0 = new String("Coding ");
		String s1 = "is ";
		String s2 = "awesome\u0021";
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = "Hello";
						
		System.out.println(s0 + s1 + s2); 
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s5 == "Hello");
	}
}

/****************************
 * Output:					*
 * Coding is awesome!		*
 * false					*
 * true						*
 * true						*
 ****************************
 * Unicode for "!": U+0021	*
 ****************************/

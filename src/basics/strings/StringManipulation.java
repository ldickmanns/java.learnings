package basics.strings;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class StringManipulation {

	public static void main(String[] args) {
		String hello = "Hello ";
		String world = "World!";
		
		String trimmed = hello.trim() 
				+ world.trim();
		String uk = hello.toUpperCase() 
				+ world.toUpperCase();
		String lk = hello.toLowerCase()
				+ world.toLowerCase();
		
		System.out.println(hello + world);
		System.out.println(trimmed);
		System.out.println(uk);
		System.out.println(lk);
	}
}

/****************
 * Output:		*
 * Hello World!	*
 * HelloWorld!	*
 * HELLO WORLD!	*
 * hello world!	*
 ****************/

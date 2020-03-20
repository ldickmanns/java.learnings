package basics.types.wrapper;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Shorts {

	public static void main(String[] args) {
		// Primitive short:
		short s = 32767;
		// Wrapper class:
		Short wrapper = new Short((short)-32768);
		// Functionalities of the Wrapper:
		String st = wrapper.toString();
		short fromString = Short.parseShort(st);
		int comp = Short.compare(s, fromString);
		
		System.out.println(comp);
	}
}

/********************************************
 * Output:									*
 * 65535									*
 ********************************************
 * Short.compare(short x, short y):			*
 * 		returns positive int 	-> x > y	*
 *		returns negative int 	-> x < y	*
 *		returns 0				-> x = y	*
 ********************************************/

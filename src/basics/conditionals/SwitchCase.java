package basics.conditionals;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class SwitchCase {

	public static void main(String[] args) {	
		// Switch case for Strings
		String s = "Hello!";
		switch (s) {
			case "Hola!":
				System.out.println("Spanish!");
				break;
			case "Hello!":
				System.out.println("English!");
				break;
			case "Hallo!":
				System.out.println("German!");
				break;
			default:
				break;
		}
	}
}

/************
 * Output:	*
 * English!	*
 ************/

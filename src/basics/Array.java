package basics;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		String[] strings = new String[4];
		strings[0] = "Coding ";
		strings[1] = "is ";
		strings[2] = "awesome! ";
		
		for(int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
		}
		
		String[] s = {"Coding ", "is ", "awesome "};
		Arrays.sort(s);
		
		System.out.println("\nSorted:");
		for (String string : s) {
			System.out.print(string);			
		}
	}
}

/****************************
 * Output:					*
 * Coding is awesome! null	*
 * Sorted:					*
 * Coding awesome is		*
 ****************************/

package io;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.Scanner;

public class InputFromConsole {

	public static void main(String[] args) {
		System.out.println("Enter your name:");
		// Scanner class
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		scanner.close();
	}
}

/****************************************
 * Output:								*
 * Enter your name:			(output)	*
 * Java Learnings			(input)		*
 * Hello Java Learnings!	(output)	*
 ****************************************/

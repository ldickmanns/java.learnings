package com.learnings.java.quizzes.output;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Quiz6 {
	
	/**
	 * Output Quiz:
	 * What's the output?
	 * 		1. No output
	 * 		2. Hello
	 * 		3. Endless Loop
	 * 		4. Compiler Error
	 */
	public static void main(String[] args) {
		for (int i = 0; true; i++) {
			System.out.println("Hello!");
		}
	}
}

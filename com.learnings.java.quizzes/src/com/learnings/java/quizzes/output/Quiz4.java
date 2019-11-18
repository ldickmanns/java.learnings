package com.learnings.java.quizzes.output;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Quiz4 {

	/**
	 * Output Quiz:
	 * What's the output?
	 * 		1.  2  2 
	 * 		2.  2 11
	 * 		3. 11  2
	 * 		4. 11 11
	 * 		5. Compiler Error
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = a;
		System.out.println("" + a + b);
		System.out.println(a + b + "");
	}
}

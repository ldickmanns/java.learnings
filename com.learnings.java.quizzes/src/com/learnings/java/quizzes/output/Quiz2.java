package com.learnings.java.quizzes.output;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Quiz2 {

	/**
	 * Output Quiz:
	 * What's the output?
	 * 		1. true 
	 * 		2. false
	 * 		3. Compiler Error
	 */
	public static void main(String[] args) {
		String s1 = new String("Hello World!");
		String s2 = new String("Hello WorLd!");
		boolean b = s1.equals(s2) == s2.equals(s1);
		System.out.println(b);
	}
}

package com.learnings.java.quizzes.output;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Quiz1 {

	/**
	 * Output Quiz:
	 * What's the output?
	 * 		1. true  true 
	 * 		2. true  false
	 * 		3. false true
	 * 		4. false false
	 */
	public static void main(String[] args) {
		String s1 = "Java Learnings";
		String s2 = "Java Learnings";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

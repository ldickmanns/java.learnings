package com.learnings.java.quizzes.output;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Quiz5 {

	/**
	 * Output Quiz:
	 * What's the output?
	 * 		1. null null 
	 * 		2. 0	0
	 * 		3. 0.0	0.0
	 * 		4. Compiler Error
	 */
	public static void main(String[] args) {
		Size size = new Size();
		System.out.print(size.width);
		System.out.print(" ");
		System.out.print(size.height);
	}
}

class Size {
	protected double width;
	protected double height;
}

package com.learnings.java.recursion;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println(factorial(3));
		System.out.println(factorial(5));
	}

	private static int factorial(int n) {
		/** Stop Condition. */
		if (n <= 1) return 1;
		/** Recursive Call. */
		return n * factorial(n - 1);
	}
}

/****************
 * Output:		*
 * 1			*
 * 6			*
 * 120			*
 ****************/

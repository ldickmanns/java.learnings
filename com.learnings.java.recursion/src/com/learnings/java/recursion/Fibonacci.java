package com.learnings.java.recursion;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Fibonacci {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	
	private static int fib(int n) {
		/** Stop Condition. */
		if (n <= 1) return n;
		/** Recursive Call. */
		return fib(n - 1) + fib(n - 2);
	}
}

/****************************
 * Output:					*
 * 0 1 1 2 3 5 8 13 21 34 	*
 ****************************/

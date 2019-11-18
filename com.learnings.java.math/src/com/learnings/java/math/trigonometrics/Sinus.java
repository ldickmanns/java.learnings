package com.learnings.java.math.trigonometrics;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Sinus {
	
	public static void main(String[] args) {
		double pi = Math.PI;
		System.out.println(Math.sin(0.0));
		System.out.println(Math.sin(pi / 2));
		System.out.println(Math.round(Math.sin(pi)));
		System.out.println(Math.sin(3 * pi / 2));
		System.out.println(Math.round(Math.sin(2 * pi)));
	}
}

/************
 * Output:	*
 *  0.0		*
 *  1.0		*
 *  0		*
 * -1.0		*
 *  0		*
 ************/

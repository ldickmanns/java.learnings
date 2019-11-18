package com.learnings.java.oop.interfaces;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Rectangle implements IAreaShape {

	private double width;
	private double height;
	
	/** Constructor. */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}

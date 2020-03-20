package oop.concepts.interfaces;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Circle implements IAreaShape {

	private double radius;
	
	/** Constructor. */
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
}

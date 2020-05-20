package oop.concepts.interfaces.shapes;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Interfaces {

	public static void main(String[] args) {
		// Circle class:
		Circle circle = new Circle(1.0);
		
		// Rectangle class:
		Rectangle rectangle = new Rectangle(2.0, 3.0);
		
		// Method of the IAreaShape interface:
		System.out.println("Circle:");
		System.out.println(circle.area());
		System.out.println("Rectangle:"); 
		System.out.println(rectangle.area());
	}
}

/************************
 * Output:				*
 * Circle:				*
 * 3.141592653589793	*
 * Rectangle:			*
 * 6.0					*
 ************************/

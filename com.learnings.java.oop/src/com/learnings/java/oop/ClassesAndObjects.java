package com.learnings.java.oop;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class ClassesAndObjects {

	public static void main(String[] args) {
		Car car = new Car("My car");
		System.out.println(nameAndSpeed(car));
		
		car.accelerate(20.0);
		System.out.println(nameAndSpeed(car));
		
		car.stop();
		System.out.println(nameAndSpeed(car));
	}
	
	private static String nameAndSpeed(Car car) {
		String result = car.getName() + " drives at ";
		result += car.getSpeed() + " km/h.";
		return result;
	}
}

/********************************
 * Output:						*
 * My car drives at 0.0 km/h.	*
 * My car drives at 20.0 km/h.	*
 * My car drives at 0.0 km/h.	*
 ********************************/

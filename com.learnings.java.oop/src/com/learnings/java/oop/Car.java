package com.learnings.java.oop;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Car {
	
	private double speed = 0;
	private String name;
	
	/** Constructor. */
	public Car(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void accelerate(double speed) {
		this.speed = speed;
	}
	
	public void stop() {
		this.speed = 0.0;
	}
}

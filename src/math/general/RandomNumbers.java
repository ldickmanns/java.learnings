package math.general;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		// Random double number between
		// 0.0 (included) and 1.0 (excluded)
		double d1 = Math.random();
		
		// Random Class
		Random random = new Random();
		// Random integer number:
		int i = random.nextInt(10);
		// Random double number:
		double d2 = random.nextDouble();
		
		System.out.println(d1);
		System.out.println(i);
		System.out.println(d2);
	}
}

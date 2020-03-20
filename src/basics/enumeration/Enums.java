package basics.enumeration;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Enums {

	public static void main(String[] args) {
		Direction up = Direction.valueOf("UP");
		System.out.println(up.toString());
		System.out.println(up == Direction.UP);
		
		for (Direction direction : Direction.values()) {
			move(direction);
		}
	}

	private static void move(Direction direction) {
		switch (direction) {
		case UP:
			System.out.println("Go up!");
			break;
		case RIGHT:
			System.out.println("Go right!");
			break;
		case DOWN:
			System.out.println("Go down!");
			break;
		case LEFT:
			System.out.println("Go left!");
			break;
		default:
			break;
		}
	}
}

/****************
 * Output:		*
 * UP			*
 * true			*
 * Go up!		*
 * Go right!	*
 * Go down!		*
 * Go left!		*
 ****************/

package basics.types.wrapper;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Floats {

	public static void main(String[] args) {
		// primitive float:
		float f = 1.9f;
		// Wrapper class:
		Float wrapper = new Float(f);
		// Functionalities of the Wrapper:
		Float posInf = Float.POSITIVE_INFINITY;
		Float negInf = Float.NEGATIVE_INFINITY;
		Float nan = Float.NaN;
		
		System.out.println(posInf);
		System.out.println(negInf);
		System.out.println(nan);
		System.out.println(Float.isFinite(posInf));
		System.out.println(Float.isInfinite(negInf));
		System.out.println(Float.isNaN(nan));
	}
}

/****************
 * Output:		*
 *  Infinity	*
 * -Infinity	*
 *  NaN			*
 *  false		*
 *  true		*
 *  true		*
 ****************/

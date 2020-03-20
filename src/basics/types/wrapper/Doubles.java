package basics.types.wrapper;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Doubles {

	public static void main(String[] args) {
		// primitive double:
		double d = 1.999;
		// Wrapper class:
		Double wrapper = new Double(d);
		// Functionalities of the Wrapper:
		Double posInf = Double.POSITIVE_INFINITY;
		Double negInf = Double.NEGATIVE_INFINITY;
		Double nan = Double.NaN;
		
		double posDiffByZero = 1.0/0.0;
		double negDiffByZero = -1.0/0.0;
		double zeroDiffByZero = 0.0/0.0;

		System.out.println(posInf.equals(posDiffByZero));
		System.out.println(negInf.equals(negDiffByZero));
		System.out.println(nan.equals(zeroDiffByZero));
		System.out.println((int) d);
	}
}

/************
 * Output:	*
 * true		*
 * true		*
 * true		*
 * 1		*
 ************/

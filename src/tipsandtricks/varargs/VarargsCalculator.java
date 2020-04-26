package tipsandtricks.varargs;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class VarargsCalculator {
    /****************************************************************
     * Java supports a variable number of arguments for methods.    *
     * This is done with the "..." operator. Further, you can       *
     * iterate over the varargs with a foreach loop (see below)     *
     ****************************************************************/
    static int addNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /****************************************************************
     * Methods with varargs can have more arguments. However, the   *
     * varargs must be the last argument(s). You can get the number *
     * of varargs similar to the length of an array. (see below)    *
     ****************************************************************/
    static int[] increaseNumbersByValue(int value, int... numbers) {
        int[] increasedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            increasedNumbers[i] = numbers[i] + value;
        }
        return increasedNumbers;
    }
}


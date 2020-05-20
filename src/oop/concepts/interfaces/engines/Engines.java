package oop.concepts.interfaces.engines;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class Engines {
    public static void main(String[] args) {
        ElectricalEngine ee = new ElectricalEngine();
        ee.accelerate();
        /** Output: Accelerating electrically! */

        CombustionEngine ce = new CombustionEngine();
        ce.accelerate();
        /** Output: Burning fuel! */
    }
}


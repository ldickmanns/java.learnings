package oop.concepts.interfaces.engines;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

/** Interfaces define a set of methods. */
public interface Engine {
    void accelerate();
}

/** Classes implement interfaces with "implements" */

class ElectricalEngine implements Engine {
    public void accelerate() {
        System.out.println("Accelerating electrically!");
    }
}

class CombustionEngine implements Engine {
    public void accelerate() {
        System.out.println("Burning fuel!");
    }
}


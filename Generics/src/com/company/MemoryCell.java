package com.company;

/**
 * Generic memory cell class that stores data inside an object.
 * Uses the Object class for genericity.
 *
 * @author Alejandro Zuniga
 */
public class MemoryCell {

    /**
     * Data to store inside object
     */
    private Object storedValue;

    /**
     * Accessor method for stored value.
     *
     * @return the stored value
     */
    public Object read() {
        return storedValue;
    }

    /**
     * Sets the stored value for the object.
     *
     * @param x value to store
     */
    public void write(Object x) {
        storedValue = x;
    }
}

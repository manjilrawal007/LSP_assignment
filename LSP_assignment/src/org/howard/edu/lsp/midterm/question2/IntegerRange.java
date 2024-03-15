package org.howard.edu.lsp.midterm.question2;

/**
 * Concrete implementation of a range specifically for integers.
 */
public class IntegerRange implements Range {
    private int start;
    private int end;
    
    /**
     * Initializes an IntegerRange with default start and end values.
     */
    public IntegerRange() {
        // Default constructor with no bounds initialized.
    }
    
    /**
     * Initializes an IntegerRange with the given start and end values.
     *
     * @param start the starting value of the range
     * @param end the ending value of the range
     */
    public IntegerRange(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    /**
     * Determines whether the range includes the specified integer.
     *
     * @param value the integer to verify
     * @return true if the integer is within the range bounds, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= this.start && value <= this.end;
    }
    
    /**
     * Updates the end value of the range.
     *
     * @param end the new ending value to apply
     */
    public void setEnd(int end) {
        this.end = end;
    }
    
    /**
     * Updates the start value of the range.
     *
     * @param start the new starting value to apply
     */
    public void setStart(int start) {
        this.start = start;
    }
    
    
    /**
     * Assesses whether there is any commonality between this and another range.
     *
     * @param other the other range to compare against
     * @return true if there is a shared portion between the ranges, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        if (other instanceof IntegerRange) {
            IntegerRange otherRange = (IntegerRange) other;
            return !(this.end < otherRange.start || this.start > otherRange.end);
        } else {
            // Handle overlap comparison with different Range implementations
            // Default behavior is to return false for unknown range types
            return false;
        }
    }
    
    /**
     * Calculates how many discrete integers the range covers.
     *
     * @return the count of integers within the range
     */
    @Override
    public int size() {
        return this.end - this.start + 1;
    }
    
    /**
     * Compares this range with another object to determine if they are the same.
     *
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange other = (IntegerRange) obj;
        return start == other.start && end == other.end;
    }
}
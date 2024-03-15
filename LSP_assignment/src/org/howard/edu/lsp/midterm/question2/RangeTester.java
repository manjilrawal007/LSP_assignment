package org.howard.edu.lsp.midterm.question2;

/**
 * This class serves as a tester for the IntegerRange class operations.
 */
public class RangeTester {
    
    /**
     * Executes tests on the IntegerRange class to validate its operations.
     * It instantiates IntegerRange objects and checks their methods, outputting the results.
     * 
     * @param args Command line arguments (not utilized here)
     */
    public static void main(String[] args) {
        // Initialize two distinct ranges for testing
        IntegerRange firstRange = new IntegerRange(1, 5);
        IntegerRange secondRange = new IntegerRange(3, 7);

        // Verify if specific values are within the ranges
        System.out.println("firstRange includes 3: " + firstRange.contains(3)); 
        System.out.println("secondRange includes 8: " + secondRange.contains(8)); 

        // Determine if the ranges have any intersecting numbers
        System.out.println("firstRange intersects with secondRange: " + firstRange.overlaps(secondRange)); 

        // Calculate the count of numbers in the first range
        System.out.println("Total numbers in firstRange: " + firstRange.size());

        // Assess equality between firstRange and a new equivalent range
        IntegerRange thirdRange = new IntegerRange(1, 5);
        System.out.println("firstRange is equivalent to thirdRange: " + firstRange.equals(thirdRange)); 
    }
}

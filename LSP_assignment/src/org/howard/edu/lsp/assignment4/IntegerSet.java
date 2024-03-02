package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Responsible for implementing set operations for IntegerSet.
 * Author: Manjil Rawal
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<>();

    /**
     * Constructs an empty IntegerSet.
     */
    public IntegerSet() {}

    // Constructor for initializing with existing set
    public IntegerSet(ArrayList<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<>(set);
        this.set = new ArrayList<>(hashSet);
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return size of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if an object is equal to the set.
     * @param obj Object to compare with
     * @return true if the object is equal to the set, false otherwise
     */
    public boolean equals(Object obj) {
        HashSet<Integer> newSet = new HashSet<>();
        if (obj instanceof HashSet) {
            newSet = (HashSet<Integer>) obj;
        } else if (obj instanceof Collection) {
            newSet = new HashSet<>((Collection<? extends Integer>) obj);
        }
        HashSet<Integer> existingSet = new HashSet<>(set);
        return newSet.equals(existingSet);
    }

    /**
     * Checks if the set contains a specific value.
     * @param value integer value to check for
     * @return true if the value is present in the set, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Exception class for IntegerSet.
     */
    public class IntegerSetException extends Exception {
        /**
         * Constructs an IntegerSetException with a default message.
         */
        public IntegerSetException() {
            super("The set is empty");
        }
    }

    /**
     * Returns the largest value in the set.
     * @return the largest value in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (length() == 0) {
            throw new IntegerSetException();
        }
        return Collections.max(set);
    }

    /**
     * Returns the smallest value in the set.
     * @return the smallest value in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (length() == 0) {
            throw new IntegerSetException();
        }
        return Collections.min(set);
    }

    /**
     * Adds an element to the set if it's not already present.
     * @param item integer item to add
     */
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an element from the set if it's present.
     * @param item integer item to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set.
     * @param intSetb IntegerSet to union with
     */
    public void union(IntegerSet intSetb) {
        set.addAll(intSetb.set);
    }

    /**
     * Performs the intersection of this set with another set.
     * @param intSetb IntegerSet to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Finds the difference between this set and another set.
     * @param intSetb IntegerSet to find the difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Finds the complement of this set.
     * @param intSetb IntegerSet to find the complement with
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            if (!intSetb.contains(set.get(i))) {
                newList.add(set.get(i));
            }
        }
        set = newList;
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return length() == 0;
    }

    /**
     * Returns a string representation of the set.
     * @return string representation of the set
     */
    public String toString() {
        return set.toString();
    }
}
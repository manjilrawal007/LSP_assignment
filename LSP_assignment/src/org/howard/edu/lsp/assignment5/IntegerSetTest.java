package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;

public class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest());
    }

    @Test
    @DisplayName("Test case for largest with exception")
    public void testLargestWithException() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
        assertEquals("The set is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(4);
        assertTrue(set.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        set.remove(5);
        assertFalse(set.contains(5));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2) && set1.length() == 1);
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.contains(1) && !set1.contains(2));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set1.complement(set2);
        assertTrue(set1.contains(1) && set1.contains(2) && !set1.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }
}